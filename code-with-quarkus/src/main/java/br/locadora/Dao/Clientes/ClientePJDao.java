package br.locadora.Dao.Clientes;

import br.locadora.Dao.Generics.GenericAbstractDao;
import br.locadora.Domain.Clientes.ClientePJ;
import br.locadora.Domain.Interfaces.ICliente;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class ClientePJDao extends GenericAbstractDao<ICliente, ClientePJ> {
    public ClientePJDao() {
        super.persistedClass = ClientePJ.class;
    }
}
