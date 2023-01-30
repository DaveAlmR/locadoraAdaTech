package br.locadora.Strategies;

import br.locadora.Domain.Interfaces.AbstractPagamento;

public interface IPagamentoStrategy {
    void validar(AbstractPagamento pagamento);
    void executarPagamento(AbstractPagamento pagamento);
}
