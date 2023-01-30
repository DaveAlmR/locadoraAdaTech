package br.locadora.Services;

import br.locadora.Dao.ContratoDao;
import br.locadora.Domain.Interfaces.AbstractPagamento;
import br.locadora.Strategies.IPagamentoStrategy;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

@RequestScoped
public class PagamentoService {


    @Inject
    private ContratoDao contratoDao;

    public void pagar(IPagamentoStrategy pagamentoStrategy, int idContrato, AbstractPagamento pagamento) {

        try {
            var contrato = contratoDao.findByKey(idContrato);
            pagamentoStrategy.validar(pagamento);
            pagamentoStrategy.executarPagamento(pagamento);

            contrato.setPago(true);
            contratoDao.merge(contrato);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }
}
