package fr.univaix.iut.pokebattle;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

public abstract class DAO_JPA_Pokemon implements DAOPokemon {

    private EntityManager entityManager;

    public DAO_JPA_Pokemon(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Pokemon> findByType(String type) {
        TypedQuery<Pokemon> query = entityManager.createNamedQuery(Pokemon.FIND_BY_TYPE, Pokemon.class);
        query.setParameter("ftype", type);
        return query.getResultList();
    }
    
    public Pokemon findByNom(String nom) {
        TypedQuery<Pokemon> query = entityManager.createNamedQuery(Pokemon.FIND_BY_NOM, Pokemon.class);
        query.setParameter("fnom", nom);
        return query.getSingleResult();
    }

    @Override
    public boolean delete(Pokemon obj) {
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

    @Override
    public List<Pokemon> findAll() {
        TypedQuery<Pokemon> query = entityManager.createNamedQuery(Pokemon.FIND_ALL, Pokemon.class);
        return query.getResultList();
    }

    @Override
    public Pokemon getById(String id) {
        return entityManager.find(Pokemon.class, id);
    }

    @Override
    public Pokemon insert(Pokemon obj) {
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.persist(obj);
        tx.commit();
        return entityManager.find(Pokemon.class, obj.getNom());
    }

    @Override
    public boolean update(Pokemon obj) {
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
}