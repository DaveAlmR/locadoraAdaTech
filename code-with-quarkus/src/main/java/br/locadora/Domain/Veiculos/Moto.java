package br.locadora.Domain.Veiculos;

import br.locadora.Domain.Interfaces.AbstractVeiculo;
import br.locadora.Enums.CategoriaEnum;
import br.locadora.Strategies.IVeiculoDaoStrategy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Moto extends AbstractVeiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    public Moto(String placa, String renavam, String chassi, CategoriaEnum categoria) {
        super(placa, renavam, chassi, categoria);
    }

    public Moto() {}
    @Override
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public int getId() {
        return this.id;
    }
}
