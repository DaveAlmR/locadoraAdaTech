package br.locadora.Services;

import br.locadora.Domain.Interfaces.IBaseLocadoraModel;
import br.locadora.Domain.Interfaces.ICliente;

import javax.transaction.Transactional;
import java.util.ArrayList;

public interface IService<T> {
    T persist(T dado);
    T find(int id);
    void remove(int id);
    void update(T dado, int id);
    ArrayList<T> getAll();
}
