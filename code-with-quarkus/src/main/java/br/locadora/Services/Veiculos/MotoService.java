package br.locadora.Services.Veiculos;

import br.locadora.Dao.Veiculos.MotoDao;
import br.locadora.Domain.Interfaces.AbstractVeiculo;
import br.locadora.Services.IService;
import br.locadora.Strategies.IVeiculoServiceStrategy;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.ArrayList;

@RequestScoped
public class MotoService implements IVeiculoServiceStrategy, IService<AbstractVeiculo> {

    @Inject
    MotoDao motoDao;

    public AbstractVeiculo persist(AbstractVeiculo veiculo) {
        try {
            return motoDao.persist(veiculo);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    public AbstractVeiculo find(int id) {
        try {
            var cliente = motoDao.findByKey(id);

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
            var clienteToRemove = motoDao.findByKey(id);

            if (clienteToRemove == null)
                throw new RuntimeException("Veiculo não encontrado");

            motoDao.remove(clienteToRemove);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    public void update(AbstractVeiculo cliente, int id) {
        try {
            var clienteToUpdate = motoDao.findByKey(id);

            if (clienteToUpdate == null)
                throw new RuntimeException("Veiculo não encontrado");

            cliente.setId(id);
            motoDao.merge(cliente);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    public ArrayList<AbstractVeiculo> getAll() {
        try {
            return new ArrayList<AbstractVeiculo>(motoDao.getAll());
        }catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e);
            throw e;
        }
    }
}
