package br.locadora.Domain.Pagamentos;

import br.locadora.Domain.Interfaces.AbstractPagamento;

public class Credito extends AbstractPagamento {
    private String numeroCartao;
    private String nomeCartao;
    private String dataVencimento;
    private String CVV;
    private String cpfTitular;
}
