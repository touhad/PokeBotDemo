package fr.univaix.iut.pokebattle.smartcell;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.univaix.iut.pokebattle.DAOFactoryJPA;
import fr.univaix.iut.pokebattle.DAOPokemon;
import fr.univaix.iut.pokebattle.Pokemon;
import fr.univaix.iut.pokebattle.DAO_JPA_Pokemon;
import fr.univaix.iut.pokebattle.twitter.Tweet;

/**
 * Reply to all.
 */

public class PokemonCriesCell implements SmartCell {

	
    public String ask(Tweet question) {
    	
        DAOPokemon DAO = DAOFactoryJPA.createDAOPokemon();
        Pokemon Ramoloss = DAO.findByNom("RamolossPiot");
        
        String Cri = Ramoloss.getCri();
        System.out.println(Cri);
        
        return Cri;
        
    }

}
