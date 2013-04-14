package fr.univaix.iut.pokebattle.smartcell;

import fr.univaix.iut.pokebattle.DAOFactoryJPA;
import fr.univaix.iut.pokebattle.DAOPokemon;
import fr.univaix.iut.pokebattle.Pokemon;
import fr.univaix.iut.pokebattle.twitter.Tweet;


public class PokemonCaptureCell implements SmartCell {

    public String ask(Tweet question) {

    	// Question contient le Tweet.
        String Question = question.getText(); 
        
        if (Question.contains("pokeball")) {
        	
        	//Contiens le nom du twitteur.
	        String NomTwitteur = question.getScreenName(); 
	        
	        // Recupere le nom du pokemon que l'on veux capturer.
	        String bits[] = Question.split("pokeball");
	        String pkm = bits[0];
	        
	        DAOPokemon DAO = DAOFactoryJPA.createDAOPokemon();
	        Pokemon pokemon = DAO.getById(pkm);
	        
	        String Eleveur = pokemon.getEleveur();
	        
	        if (Eleveur.contentEquals("null")) {
	        	pokemon.setEleveur(NomTwitteur);
	        	Eleveur = pokemon.getEleveur();
	        	
	        }
	        	
	        System.out.println(NomTwitteur + " " + Eleveur + " is my owner");
	        return NomTwitteur + " " + Eleveur + " is my owner";
	        
        }
        
        return null;

    } // ask()

} // PokemonCaptureCell()







