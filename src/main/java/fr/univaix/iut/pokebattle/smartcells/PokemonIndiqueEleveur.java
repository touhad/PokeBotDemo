package fr.univaix.iut.pokebattle.smartcells;

import fr.univaix.iut.pokebattle.Pokemon;
import fr.univaix.iut.pokebattle.smartcell.SmartCell;
import fr.univaix.iut.pokebattle.twitter.Tweet;

public class PokemonIndiqueEleveur implements SmartCell {

	Pokemon Magicarpe = new Pokemon("@MagicarpePiot");
	
	@Override
	public String ask(Tweet question) {
		String Question = question.getText();
    	if (Question.contains("owner?") || Question.contains("owner ?")
    		|| Question.contains("Owner?") || Question.contains("Owner ?"))	
    	{	
			Magicarpe.setEleveur("@PoussinPiot");
			if (Magicarpe.getEleveur() == null )
				return "No owner";
		
			return Magicarpe.getEleveur() + "is my owner" ;
	
    	}
    	return null;
	}
}
