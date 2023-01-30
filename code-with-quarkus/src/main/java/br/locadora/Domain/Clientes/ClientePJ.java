package br.locadora.Domain.Clientes;


import br.locadora.Domain.Interfaces.IBaseLocadoraModel;
import br.locadora.Domain.Interfaces.ICliente;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class ClientePJ  implements ICliente, IBaseLocadoraModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String cnpj;
    private String rasaoSocial;
    private String endereco;
    private String contato;

    @Override
    public void setId(int id) {
        this.id = id;
    }
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRasaoSocial() {
        return rasaoSocial;
    }

    public void setRasaoSocial(String rasaoSocial) {
        this.rasaoSocial = rasaoSocial;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    @Override
    public String toString() {
        return "ClientePJ{" +
                "cnpj='" + cnpj + '\'' +
                ", rasaoSocial='" + rasaoSocial + '\'' +
                ", endereco='" + endereco + '\'' +
                ", contato='" + contato + '\'' +
                '}';
    }

    @Override
    public int getId() {
        return this.id;
    }
}
