package fr.univaix.iut.pokebattle.smartcells;

import fr.univaix.iut.pokebattle.Pokemon;
import fr.univaix.iut.pokebattle.SmartCell;
import fr.univaix.iut.pokebattle.Tweet;

public class PokemonCaptureCell implements SmartCell {
	
    public String ask(Tweet question) {
    	
    	String Question = question.getText(); // Question contient le Tweet
    	String NomEleveur = question.getScreenName(); //Contiens le nom du twitteur
		Pokemon Ramoloss = new Pokemon ("@RamolossPiot", "Eau", "Argneu", "Rouge royal", null, "Flagados",
				  null, "Blourf Blourf", 129, 0, 1, 100, 100, 10, 21, 9);

		/* TO-DO 
		 * -Récupérer le nom du pokemon
		 * -Se connecter au pokemon correspondant
		 * -Récupérer son nom d'éleveur !
		 * - Si pas d'éleveur modifier dans la base le nouvelle éleveur
		 * -Adapter la suite du code et fini !
		 */
		
    	if (Question.contains("pokeball!")) {
    		String bits[] = Question.split("pokeball!");
    		String NomPokemon = bits[0]; /* NomPokemon contient le nom du pokemon a capturer */	
    		if (Ramoloss.IsSauvage(Ramoloss))
    			Ramoloss.setEleveur(NomEleveur);
    	}
	
    	return "@" + NomEleveur + " " + "@" + Ramoloss.getEleveur() + " is my owner";
    	
    }

}