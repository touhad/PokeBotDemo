package fr.univaix.iut.pokebattle.smartcells;

import fr.univaix.iut.pokebattle.Pokemon;
import fr.univaix.iut.pokebattle.Tweet;

public class PokemonCaptureCell {
	
    public String ask(Tweet question) {
    	String Question = question.getText();
    	String NomEleveur = question.getScreenName();
    	if (Question.contains("pokeball!")) {
    		
    		String bits[] = Question.split("pokeball!");
    		String NomPokemon = bits[0]; /* NomPokemon contient le nom du pokemon a capturer */
    		
    		Pokemon Mewtwo = new Pokemon (NomPokemon);
    		
    		
    		if (Mewtwo.IsSauvage(Mewtwo))
    			Mewtwo.setEleveur(NomEleveur);

    	}
    		return  "@Alex @Alex is my Owner";
    	/*return NomEleveur + " " + NomEleveur + " is my Owner";  		*/
    }

}


/*
public String ask(String question) {
	if (question.contains("m'appelle"))
		return "Bonjour " + extractName(question) + "!";
	else
		return null;
}

private String extractName(String question) {
	String bits[] = question.split("appelle ");
	String name = bits[bits.length - 1];
	
	return name;
}*/