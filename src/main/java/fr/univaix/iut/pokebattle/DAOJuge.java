package fr.univaix.iut.pokebattle;

import java.util.List;

public interface DAOJuge extends DAO<Juge, String> {
    public List<Juge> findByNom(String nom);
}