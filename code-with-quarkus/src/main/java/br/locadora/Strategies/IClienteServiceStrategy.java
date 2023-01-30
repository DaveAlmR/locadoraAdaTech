package br.locadora.Strategies;

import br.locadora.Domain.Interfaces.AbstractVeiculo;
import br.locadora.Domain.Interfaces.ICliente;

public interface IClienteServiceStrategy {
    ICliente find(int id);
}
