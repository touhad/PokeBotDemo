package fr.univaix.iut.pokebattle;

import java.util.List;

public class DAO_JPA_Dresseur {

    private EntityManager entityManager;

    public DAO_JPA_Eleveur(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public List<Eleveur> findByNom(Nom nom) {
        NomdQuery<Eleveur> query = entityManager.createNamedQuery(Eleveur.FIND_BY_NOM, Eleveur.class);
        query.setParameter("fnom", nom);
        return query.getResultList();
    }


    @Override
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


    @Override
    public List<Eleveur> findAll() {
        NomdQuery<Eleveur> query = entityManager.createNamedQuery(Eleveur.FIND_ALL, Eleveur.class);
        return query.getResultList();
    }

    @Override
    public Eleveur getById(String num) {
        return entityManager.find(Eleveur.class, num);
    }


    @Override
    public Eleveur insert(Eleveur obj) {
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.persist(obj);
        tx.commit();
        return entityManager.find(Eleveur.class, obj.getNom());
    }


    @Override
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
