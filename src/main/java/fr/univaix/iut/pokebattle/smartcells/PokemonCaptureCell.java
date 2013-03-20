package fr.univaix.iut.pokebattle.smartcells;

import fr.univaix.iut.pokebattle.Pokemon;
import fr.univaix.iut.pokebattle.Tweet;

public class PokemonCaptureCell {
	
    public String ask(Tweet question) {
    	
    	String Question = question.getText();
    	String NomEleveur = question.getScreenName();
    	
		String bits[] = Question.split("pokeball!");
		String NomPokemon = bits[0]; /* NomPokemon contient le nom du pokemon a capturer */	
		
    	Pokemon Magicarpe = new Pokemon (NomPokemon);
    	
		
    	if (Question.contains("pokeball!"))    		  		
    		if (Magicarpe.IsSauvage(Magicarpe))
    			Magicarpe.setEleveur(NomEleveur);
	
    	return NomEleveur + " " + Magicarpe.getEleveur() + " is my Owner";
    	
    }

}