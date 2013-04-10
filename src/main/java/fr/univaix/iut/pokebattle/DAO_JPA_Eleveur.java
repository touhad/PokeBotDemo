package fr.univaix.iut.pokebattle;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

public class DAO_JPA_Eleveur implements DAOEleveur{

    private EntityManager entityManager;

    public DAO_JPA_Eleveur(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    public List<Eleveur> findByNom(String nom) {
        TypedQuery<Eleveur> query = entityManager.createNamedQuery(Eleveur.FIND_BY_NOM, Eleveur.class);
        query.setParameter("fnom", nom);
        return query.getResultList();
    }


    public boolean delete(Eleveur obj) {
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


    public List<Eleveur> findAll() {
        TypedQuery<Eleveur> query = entityManager.createNamedQuery(Eleveur.FIND_ALL, Eleveur.class);
        return query.getResultList();
    }

    public Eleveur getById(String num) {
        return entityManager.find(Eleveur.class, num);
    }


    public Eleveur insert(Eleveur obj) {
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.persist(obj);
        tx.commit();
        return entityManager.find(Eleveur.class, obj.getNom());
    }


    public boolean update(Eleveur obj) {
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

} // DAO_JPA_Eleveur
