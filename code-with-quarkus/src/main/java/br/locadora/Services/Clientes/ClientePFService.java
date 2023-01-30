package br.locadora.Services.Clientes;

import br.locadora.Dao.Clientes.ClientePFDao;
import br.locadora.Domain.Interfaces.IBaseLocadoraModel;
import br.locadora.Domain.Interfaces.ICliente;
import br.locadora.Services.IService;
import br.locadora.Strategies.IClienteServiceStrategy;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.ArrayList;

@RequestScoped
public class ClientePFService implements IService<ICliente>, IClienteServiceStrategy {
    @Inject
    ClientePFDao clientePFDao;

    @Override
    public ICliente persist(ICliente cliente) {
        try {
            return clientePFDao.persist(cliente);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    @Override
    public ICliente find(int id) {
        try {
            var cliente = clientePFDao.findByKey(id);

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
            var clienteToRemove = clientePFDao.findByKey(id);

            if (clienteToRemove == null)
                throw new RuntimeException("Cliente não encontrado");

            clientePFDao.remove(clienteToRemove);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    @Override
    public void update(ICliente cliente, int id) {
        try {
            var clienteToUpdate = clientePFDao.findByKey(id);

            if (clienteToUpdate == null)
                throw new RuntimeException("Cliente não encontrado");

            cliente.setId(id);
            clientePFDao.merge(cliente);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    @Override
    public ArrayList<ICliente> getAll() {
        try {
            return new ArrayList<>(clientePFDao.getAll());
        }catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e);
            throw e;
        }
    }
}
