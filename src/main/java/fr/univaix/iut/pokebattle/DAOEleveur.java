package fr.univaix.iut.pokebattle;
import java.util.List;

public interface DAOEleveur extends DAO<Eleveur, String> {
	public List<Eleveur> findByNom (Nom nom);
}