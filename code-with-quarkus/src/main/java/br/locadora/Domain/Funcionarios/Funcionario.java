package br.locadora.Domain.Funcionarios;

import br.locadora.Domain.Interfaces.IBaseLocadoraModel;
import br.locadora.Enums.FuncaoEnum;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Funcionario implements IBaseLocadoraModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String matricula;
    private String senha;
    private FuncaoEnum funcao;

    @Override
    public void setId(int id) {
        this.id = id;
    }
    public Funcionario(String matricula, String senha, FuncaoEnum funcao) {
        this.matricula = matricula;
        this.senha = senha;
        this.funcao = funcao;
    }

    public Funcionario() {}

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public FuncaoEnum getFuncao() {
        return funcao;
    }

    public void setFuncao(FuncaoEnum funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "matricula='" + matricula + '\'' +
                ", senha='" + senha + '\'' +
                ", funcao=" + funcao +
                '}';
    }

    @Override
    public int getId() {
        return this.id;
    }
}
