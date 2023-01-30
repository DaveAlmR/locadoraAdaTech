package br.locadora.Services.Clientes;

import br.locadora.Dao.Clientes.ClientePJDao;
import br.locadora.Domain.Interfaces.IBaseLocadoraModel;
import br.locadora.Domain.Interfaces.ICliente;
import br.locadora.Services.IService;
import br.locadora.Strategies.IClienteServiceStrategy;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.ArrayList;

@RequestScoped
public class ClientePJService implements IService<ICliente>, IClienteServiceStrategy {
    @Inject
    ClientePJDao clientePJDao;

    @Override
    public ICliente persist(ICliente cliente) {
        try {
            return clientePJDao.persist(cliente);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    @Override
    public ICliente find(int id) {
        try {
            var cliente = clientePJDao.findByKey(id);

            if (cliente == null)
                throw new RuntimeException("Cliente não encontrado");

            return cliente;
        }catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    @Transactional
    @Override
    public void remove(int id) {
        try {
            var clienteToRemove = clientePJDao.findByKey(id);

            if (clienteToRemove == null)
                throw new RuntimeException("Cliente não encontrado");

            clientePJDao.remove(clienteToRemove);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    @Override
    @Transactional
    public void update(ICliente cliente, int id) {
        try {
            var clienteToUpdate = clientePJDao.findByKey(id);

            if (clienteToUpdate == null)
                throw new RuntimeException("Cliente não encontrado");

            cliente.setId(id);
            clientePJDao.merge(cliente);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    @Override
    public ArrayList<ICliente> getAll() {
        try {
            return new ArrayList<>(clientePJDao.getAll());
        }catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e);
            throw e;
        }
    }
}
