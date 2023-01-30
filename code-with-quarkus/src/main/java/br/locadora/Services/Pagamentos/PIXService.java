package br.locadora.Services.Pagamentos;

import br.locadora.Domain.Interfaces.AbstractPagamento;
import br.locadora.Strategies.IPagamentoStrategy;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class PIXService implements IPagamentoStrategy {
    @Override
    public void validar(AbstractPagamento pagamento) {
        System.out.println("CODIGO PIX VALIDADO");
    }

    @Override
    public void executarPagamento(AbstractPagamento pagamento) {
        System.out.println("CONFIRMAÇÃO DE RECEBIMENTO COMPLETO");
    }
}
