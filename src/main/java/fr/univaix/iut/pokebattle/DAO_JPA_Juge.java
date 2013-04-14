package fr.univaix.iut.pokebattle;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

public class DAO_JPA_Juge {

    private EntityManager entityManager;

    public DAO_JPA_Juge(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    public List<Juge> findByNom(String nom) {
        TypedQuery<Juge> query = entityManager.createNamedQuery(Juge.FIND_BY_NOM, Juge.class);
        query.setParameter("fnom", nom);
        return query.getResultList();
    }


    public boolean delete(Juge obj) {
        try {
            EntityTransaction tx = entityManager.getTransaction();
            tx.begin();
            entityManager.remove(obj);
            tx.commit();
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    public List<Juge> findAll() {
        TypedQuery<Juge> query = entityManager.createNamedQuery(Juge.FIND_ALL, Juge.class);
        return query.getResultList();
    }

    public Juge getById(String num) {
        return entityManager.find(Juge.class, num);
    }


    public Juge insert(Juge obj) {
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.persist(obj);
        tx.commit();
        return entityManager.find(Juge.class, obj.getNom());
    }


    public boolean update(Juge obj) {
        try {
            EntityTransaction tx = entityManager.getTransaction();
            tx.begin();
            entityManager.merge(obj);
            tx.commit();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

} // DAO_JPA_Juge