package br.locadora.Dao;

import br.locadora.Dao.Generics.GenericAbstractDao;
import br.locadora.Domain.Contrato;
import br.locadora.Domain.Funcionarios.Funcionario;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class FuncionarioDao extends GenericAbstractDao<Funcionario, Funcionario> {
    public FuncionarioDao() {
        super.persistedClass = Funcionario.class;
    }
}
