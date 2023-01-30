package br.locadora.Enums;

public enum CategoriaEnum {
    ECONOMICO {
        double valorDiaria = 10;
        double valorSeguroPorDia = 5;

        public double calculaValorLocacao(int diarias) {
            return (valorDiaria + valorSeguroPorDia) * diarias;
        }
    },
    ESPORTIVO {
        double valorDiaria = 15;
        double valorSeguroPorDia = 10;

        public double calculaValorLocacao(int diarias) {
            return (valorDiaria + valorSeguroPorDia) * diarias;
        }
    },
    LUXO {
        double valorDiaria = 30;
        double valorSeguroPorDia = 20;

        public double calculaValorLocacao(int diarias) {
            return (valorDiaria + valorSeguroPorDia) * diarias;
        }
    };

    public abstract double calculaValorLocacao(int diarias);
}
