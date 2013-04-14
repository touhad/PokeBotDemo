package fr.univaix.iut.pokebattle.smartcell;

import fr.univaix.iut.pokebattle.DAOFactoryJPA;
import fr.univaix.iut.pokebattle.DAOPokemon;
import fr.univaix.iut.pokebattle.Pokemon;
import fr.univaix.iut.pokebattle.twitter.Tweet;

public class PokemonOwnerCell implements SmartCell {

    @Override
    public String ask(Tweet question) {

    	String Twitteur = question.getScreenName();
        String q = new String(question.getText());
        
        if (q.contains("owner?"))
        {
        
	        String bits[] = q.split(" ");
	        String pkm = bits[0];
	        	
	        DAOPokemon DAO = DAOFactoryJPA.createDAOPokemon();
	        Pokemon pokemon = DAO.getById(pkm);
	        
	        String eleveur = pokemon.getEleveur();
	        
	        if (eleveur.equals("null"))
	        {	
	        	System.out.println(Twitteur + " no owner"); //test
	            return Twitteur + " no owner";
	        }
	        System.out.println(Twitteur + ' ' + pokemon.getEleveur() + " is my owner"); //test
	        return Twitteur + ' ' + pokemon.getEleveur() + " is my owner";
        }
        else return null;
    }


}
