package br.locadora.Services.Pagamentos;

import br.locadora.Domain.Interfaces.AbstractPagamento;
import br.locadora.Strategies.IPagamentoStrategy;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class DinheiroService implements IPagamentoStrategy {
    @Override
    public void validar(AbstractPagamento pagamento) {
        System.out.println("CEDULAS SÃO VERDADEIRAS");
    }

    @Override
    public void executarPagamento(AbstractPagamento pagamento) {
        System.out.println("CAIXA REGISTRADORA ABERTA");
    }
}
