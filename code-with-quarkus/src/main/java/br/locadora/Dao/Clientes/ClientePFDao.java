package br.locadora.Dao.Clientes;

import br.locadora.Dao.Generics.GenericAbstractDao;
import br.locadora.Domain.Clientes.ClientePF;
import br.locadora.Domain.Clientes.ClientePJ;
import br.locadora.Domain.Interfaces.ICliente;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class ClientePFDao extends GenericAbstractDao<ICliente, ClientePF> {
    public ClientePFDao() {
        super.persistedClass = ClientePF.class;
    }
}
