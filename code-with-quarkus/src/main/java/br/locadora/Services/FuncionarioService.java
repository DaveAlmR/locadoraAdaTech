package br.locadora.Services;

import br.locadora.Dao.FuncionarioDao;
import br.locadora.Domain.Funcionarios.Funcionario;
import br.locadora.Domain.Interfaces.ICliente;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.ArrayList;

@RequestScoped
public class FuncionarioService implements IService<Funcionario>{
    @Inject
    FuncionarioDao funcionarioDao;

    @Override
    public Funcionario persist(Funcionario funcionario) {
        try {
            return funcionarioDao.persist(funcionario);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    @Override
    public Funcionario find(int id) {
        try {
            var funcionario = funcionarioDao.findByKey(id);

            if (funcionario == null)
                throw new RuntimeException("Cliente não encontrado");

            return funcionario;
        }catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    @Transactional
    @Override
    public void remove(int id) {
        try {
            var funcionarioToRemove = funcionarioDao.findByKey(id);

            if (funcionarioToRemove == null)
                throw new RuntimeException("Funcionario não encontrado");

            funcionarioDao.remove(funcionarioToRemove);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    @Override
    @Transactional
    public void update(Funcionario funcionario, int id) {
        try {
            var funcionarioToUpdate = funcionarioDao.findByKey(id);

            if (funcionarioToUpdate == null)
                throw new RuntimeException("Funcionario não encontrado");

            funcionario.setId(id);
            funcionarioDao.merge(funcionario);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    @Override
    public ArrayList<Funcionario> getAll() {
        try {
            return new ArrayList<>(funcionarioDao.getAll());
        }catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e);
            throw e;
        }
    }
}
