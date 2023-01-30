package br.locadora.Dao.Veiculos;

import br.locadora.Dao.Generics.GenericAbstractDao;
import br.locadora.Domain.Interfaces.AbstractVeiculo;
import br.locadora.Domain.Veiculos.Caminhao;
import br.locadora.Domain.Veiculos.Moto;
import br.locadora.Strategies.IVeiculoDaoStrategy;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class MotoDao extends GenericAbstractDao<AbstractVeiculo, Moto> implements IVeiculoDaoStrategy {
    public MotoDao() {
        super.persistedClass = Moto.class;
    }
}
