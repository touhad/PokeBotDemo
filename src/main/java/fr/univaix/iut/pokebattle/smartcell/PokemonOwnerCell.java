package fr.univaix.iut.pokebattle.smartcell;

import fr.univaix.iut.pokebattle.Pokemon;
import fr.univaix.iut.pokebattle.twitter.Tweet;

public class PokemonOwnerCell implements SmartCell {

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
		
			return Magicarpe.getEleveur() + " is my owner" ;
	
    	}
    	return null;
	}

}
