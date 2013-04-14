package fr.univaix.iut.pokebattle;

public interface DAOFactory {
		public DAOPokemon createDAOPokemon();
		public DAOEleveur createDAOEleveur();
		public DAOAttaque createDAOAttaque();
}
