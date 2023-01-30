package br.locadora.Domain.Interfaces;

import br.locadora.Enums.CategoriaEnum;

public abstract class AbstractVeiculo implements IBaseLocadoraModel {
    private String placa;
    private String renavam;
    private String chassi;
    private CategoriaEnum categoria;

    public AbstractVeiculo(String placa, String renavam, String chassi, CategoriaEnum categoria) {
        this.placa = placa;
        this.renavam = renavam;
        this.chassi = chassi;
        this.categoria = categoria;
    }

    public AbstractVeiculo() {}

    public double calculaValorLocacao(int diarias) {
        return this.categoria.calculaValorLocacao(diarias);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public CategoriaEnum getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaEnum categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "AbstractVeiculo{" +
                "placa='" + placa + '\'' +
                ", renavam='" + renavam + '\'' +
                ", chassi='" + chassi + '\'' +
                ", categoria=" + categoria +
                '}';
    }
}
