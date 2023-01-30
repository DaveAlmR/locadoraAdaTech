package br.locadora.Dao.Veiculos;

import br.locadora.Dao.Generics.GenericAbstractDao;
import br.locadora.Domain.Clientes.ClientePF;
import br.locadora.Domain.Interfaces.AbstractVeiculo;
import br.locadora.Domain.Veiculos.Caminhao;
import br.locadora.Domain.Veiculos.Carro;
import br.locadora.Strategies.IVeiculoDaoStrategy;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class CaminhaoDao extends GenericAbstractDao<AbstractVeiculo, Caminhao> implements IVeiculoDaoStrategy {
    public CaminhaoDao() {
        super.persistedClass = Caminhao.class;
    }
}
