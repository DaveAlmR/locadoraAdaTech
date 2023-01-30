package br.locadora.Services;

import br.locadora.DTO.AluguelDTO;
import br.locadora.Dao.ContratoDao;
import br.locadora.Domain.Contrato;
import br.locadora.Strategies.IClienteServiceStrategy;
import br.locadora.Strategies.IVeiculoDaoStrategy;
import br.locadora.Strategies.IVeiculoServiceStrategy;
import org.eclipse.microprofile.opentracing.Traced;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.ArrayList;

@Traced
@RequestScoped
public class AluguelService {

    @Inject
    ContratoDao contratoDao;

    @Transactional
    public void aluga(AluguelDTO aluguelDTO, IVeiculoServiceStrategy veiculoService, IClienteServiceStrategy clienteService) {
        try {
            var veiculo = veiculoService.find(aluguelDTO.veiculoId);
            var cliente = clienteService.find(aluguelDTO.clienteId);

            if (veiculo == null || cliente == null)
                throw new RuntimeException("Veiculo ou cliente invalidos");

            if (aluguelDTO.dias <= 0)
                throw new RuntimeException("Quantidade de dias invalido");

            var valor = veiculo.getCategoria().calculaValorLocacao(aluguelDTO.dias);
            var contrato = new Contrato(aluguelDTO.veiculoId, aluguelDTO.clienteId, valor, false);
            contratoDao.persist(contrato);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    public ArrayList<Contrato> getAll() {
        try {
            return new ArrayList<Contrato>(contratoDao.getAll());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }
}
