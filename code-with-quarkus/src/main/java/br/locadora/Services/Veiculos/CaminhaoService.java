package br.locadora.Services.Veiculos;

import br.locadora.Dao.Veiculos.CaminhaoDao;
import br.locadora.Domain.Interfaces.AbstractVeiculo;
import br.locadora.Services.IService;
import br.locadora.Strategies.IVeiculoServiceStrategy;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.ArrayList;

@RequestScoped
public class CaminhaoService implements IVeiculoServiceStrategy, IService<AbstractVeiculo> {

    @Inject
    CaminhaoDao caminhaoDao;

    public AbstractVeiculo persist(AbstractVeiculo veiculo) {
        try {
            return caminhaoDao.persist(veiculo);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    public AbstractVeiculo find(int id) {
        try {
            var cliente = caminhaoDao.findByKey(id);

            if (cliente == null)
                throw new RuntimeException("Veiculo não encontrado");

            return cliente;
        }catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    @Transactional
    public void remove(int id) {
        try {
            var clienteToRemove = caminhaoDao.findByKey(id);

            if (clienteToRemove == null)
                throw new RuntimeException("Veiculo não encontrado");

            caminhaoDao.remove(clienteToRemove);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    public void update(AbstractVeiculo cliente, int id) {
        try {
            var clienteToUpdate = caminhaoDao.findByKey(id);

            if (clienteToUpdate == null)
                throw new RuntimeException("Veiculo não encontrado");

            cliente.setId(id);
            caminhaoDao.merge(cliente);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    public ArrayList<AbstractVeiculo> getAll() {
        try {
            return new ArrayList<AbstractVeiculo>(caminhaoDao.getAll());
        }catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e);
            throw e;
        }
    }
}
