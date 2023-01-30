package br.locadora.Domain.Veiculos;

import br.locadora.Domain.Interfaces.AbstractVeiculo;
import br.locadora.Enums.CategoriaEnum;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Caminhao extends AbstractVeiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    public Caminhao(String placa, String renavam, String chassi, CategoriaEnum categoria) {
        super(placa, renavam, chassi, categoria);
    }
    @Override
    public void setId(int id) {
        this.id = id;
    }
    public Caminhao() {}

    @Override
    public int getId() {
        return this.id;
    }
}
