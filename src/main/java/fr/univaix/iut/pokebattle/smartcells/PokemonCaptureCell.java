package fr.univaix.iut.pokebattle.smartcells;

import fr.univaix.iut.pokebattle.Pokemon;
import fr.univaix.iut.pokebattle.SmartCell;
import fr.univaix.iut.pokebattle.Tweet;

public class PokemonCaptureCell implements SmartCell {
	
    public String ask(Tweet question) {
    	
    	String Question = question.getText();
    	String NomEleveur = "AlexPanizziG4";
   /* 	String NomEleveur = question.getScreenName(); */
		Pokemon Ramoloss = new Pokemon ("@RamolossPiot", "Eau", "Argneu", "Rouge royal", null, "Flagados",
				  null, "Blourf Blourf", 129, 0, 1, 100, 100, 10, 21, 9);

		
    	if (Question.contains("pokeball!")) {
    		String bits[] = Question.split("pokeball!");
    		String NomPokemon = bits[0]; /* NomPokemon contient le nom du pokemon a capturer */	
    		if (Ramoloss.IsSauvage(Ramoloss))
    			Ramoloss.setEleveur(NomEleveur);
    	}
	
    	return "@" + NomEleveur + " " + "@" + Ramoloss.getEleveur() + " is my owner";
    	
    }

}