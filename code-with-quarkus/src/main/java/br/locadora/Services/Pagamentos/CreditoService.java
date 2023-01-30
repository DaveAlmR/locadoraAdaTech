package br.locadora.Services.Pagamentos;

import br.locadora.Domain.Interfaces.AbstractPagamento;
import br.locadora.Services.PagamentoService;
import br.locadora.Strategies.IPagamentoStrategy;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

@RequestScoped
public class CreditoService implements IPagamentoStrategy {
    @Override
    public void validar(AbstractPagamento pagamento) {
        System.out.println("CARTAO VALIDADO");
    }

    @Override
    public void executarPagamento(AbstractPagamento pagamento) {
        System.out.println("CARTAO COBRADO");
    }
}
