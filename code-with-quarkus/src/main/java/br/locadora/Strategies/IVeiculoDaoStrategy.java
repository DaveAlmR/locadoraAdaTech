package br.locadora.Strategies;

import br.locadora.Domain.Interfaces.AbstractVeiculo;

public interface IVeiculoDaoStrategy {
    public AbstractVeiculo persist(AbstractVeiculo dado);
    public AbstractVeiculo findByKey(int id);
}
