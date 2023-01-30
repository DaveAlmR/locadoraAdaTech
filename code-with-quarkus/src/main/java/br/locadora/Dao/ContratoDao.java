package br.locadora.Dao;

import br.locadora.Dao.Generics.GenericAbstractDao;
import br.locadora.Domain.Contrato;
import br.locadora.Domain.Veiculos.Carro;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class ContratoDao extends GenericAbstractDao<Contrato, Contrato> {
    public ContratoDao() {
        super.persistedClass = Contrato.class;
    }
}
