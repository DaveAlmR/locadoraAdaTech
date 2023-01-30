package br.locadora.Domain;

import br.locadora.Domain.Interfaces.AbstractVeiculo;
import br.locadora.Domain.Interfaces.IBaseLocadoraModel;
import br.locadora.Domain.Interfaces.ICliente;

import javax.persistence.*;

@Entity
public class Contrato implements IBaseLocadoraModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int veiculoId;
    private int clienteId;
    private double valor;
    private boolean pago;

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Contrato(int veiculoId, int clienteId, double valor, boolean pago) {
        this.veiculoId = veiculoId;
        this.clienteId = clienteId;
        this.valor = valor;
        this.pago = pago;
    }

    public Contrato() {
    }

    public int getVeiculoId() {
        return veiculoId;
    }

    public void setVeiculoId(int veiculoId) {
        this.veiculoId = veiculoId;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    @Override
    public String toString() {
        return "Contrato{" +
                "id=" + id +
                ", veiculoId=" + veiculoId +
                ", clienteId=" + clienteId +
                ", valor=" + valor +
                ", pago=" + pago +
                '}';
    }
}
