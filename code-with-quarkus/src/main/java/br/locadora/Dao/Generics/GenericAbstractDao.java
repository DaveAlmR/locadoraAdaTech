package br.locadora.Dao.Generics;

import br.locadora.Domain.Interfaces.IBaseLocadoraModel;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import java.util.List;

public abstract class GenericAbstractDao<TG extends IBaseLocadoraModel, T> {
    @PersistenceContext
    EntityManager entityManager;
    protected Class<T> persistedClass;

    public GenericAbstractDao() { }
    public GenericAbstractDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional(rollbackOn = Exception.class)
    public TG persist(TG dado) {
        entityManager.persist(dado);
        return dado;
    }

    @Transactional(rollbackOn = Exception.class)
    public T findByKey(int id) {
        System.out.println(persistedClass);
        System.out.println(id);
        System.out.println(entityManager.find(persistedClass, id));
        return entityManager.find(persistedClass, id);
    }

    @Transactional(rollbackOn = Exception.class)
    public void remove(TG dado) {
        entityManager.remove(dado);
    }

    @Transactional(rollbackOn = Exception.class)
    public void merge(TG dado) {
        System.out.println("merge:" + dado.toString());
        entityManager.merge(dado);
    }

    @Transactional(rollbackOn = Exception.class)
    public List<T> getAll() {
        System.out.println("persistedClass: " + persistedClass);
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<T> cq = cb.createQuery(persistedClass);
        Root<T> rootEntry = cq.from(persistedClass);
        CriteriaQuery<T> all = cq.select(rootEntry);

        TypedQuery<T> allQuery = entityManager.createQuery(all);
        return allQuery.getResultList();
    }
}
