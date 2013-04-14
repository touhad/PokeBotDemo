package fr.univaix.iut.pokebattle;

import javax.persistence.EntityManager;

public class DAOFactoryJPA {
	
	private static EntityManager entityManager;

	public static void setEntityManager(EntityManager entityManager) {
		DAOFactoryJPA.entityManager = entityManager;
	}

	public static DAOPokemon createDAOPokemon() {
		return new DAO_JPA_Pokemon(entityManager);
	}

	public static DAOEleveur createDAOEleveur() {
		return new DAO_JPA_Eleveur(entityManager);
	}
	public static DAOAttaque createDAOAttaque() {
		return new DAO_JPA_Attaque(entityManager);
	}
}
