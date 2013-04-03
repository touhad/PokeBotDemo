package fr.univaix.iut.pokebattle.smartcell;

import fr.univaix.iut.pokebattle.Pokemon;
import fr.univaix.iut.pokebattle.twitter.Tweet;

public class PokemonOnlyAnswerHisOwner implements SmartCell {
		
		Pokemon Magicarpe = new Pokemon ();
		
	public String ask(Tweet question) {
		String Interloc = question.getScreenName();
		if (Magicarpe.getEleveur() != Interloc)
			return "@" + Interloc + " " + "@" + Magicarpe.getEleveur() + " is my owner";
		
		return "@" + Interloc + " " + "@" + Magicarpe.getEleveur() + " is my owner";
					
	        
	    }
}