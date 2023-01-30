package br.locadora.Strategies;

import br.locadora.Domain.Interfaces.AbstractVeiculo;

import java.util.ArrayList;

public interface IVeiculoServiceStrategy {
//    AbstractVeiculo persist(AbstractVeiculo veiculo);
    AbstractVeiculo find(int id);
//    void remove(int id);
//    void update(AbstractVeiculo cliente, int id);
//    ArrayList<AbstractVeiculo> getAll();
}
