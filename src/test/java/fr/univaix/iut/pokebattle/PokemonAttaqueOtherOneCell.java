package fr.univaix.iut.pokebattle;

import fr.univaix.iut.pokebattle.twitter.Tweet;

public class PokemonAttaqueOtherOneCell {

    public String ask(Tweet question) {
    	
    	String Question = question.getText(); // Contiens le texte twitter
    	String NomEleveur = question.getScreenName(); // Recupére le nom du twitteur
    	
		String bits[] = Question.split("#attack");
		String NomPokemon = bits[0]; /* NomPokemon contient le nom du pokemon qui attaque */	
		
    	Pokemon Attaquant = new Pokemon ();
    	Attaquant.setNom(NomPokemon);
    
    	
    	
    	Pokemon Defenseur = new Pokemon ();
    	Attaquant.setNom(NomPokemon);
    	
    	
		
    	return "Miaou";
    }

} /* pcreux: "@bulbizare1 #attack #charge @pikachuNyanNian /cc @nedseb @viviane"
	 bulbizare1: "@pikachuNyanNian #attack #charge /cc @nedseb @pcreux @viviane" */
