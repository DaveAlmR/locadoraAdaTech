package br.locadora.Dao.Veiculos;

import br.locadora.Dao.Generics.GenericAbstractDao;
import br.locadora.Domain.Interfaces.AbstractVeiculo;
import br.locadora.Domain.Veiculos.Caminhao;
import br.locadora.Domain.Veiculos.Carro;
import br.locadora.Strategies.IVeiculoDaoStrategy;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class CarroDao extends GenericAbstractDao<AbstractVeiculo, Carro> implements IVeiculoDaoStrategy {
    public CarroDao() {
        super.persistedClass = Carro.class;
    }
}
