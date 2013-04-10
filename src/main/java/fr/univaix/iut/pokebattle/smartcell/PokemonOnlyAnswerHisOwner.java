package fr.univaix.iut.pokebattle.smartcell;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import fr.univaix.iut.pokebattle.Pokemon;
import fr.univaix.iut.pokebattle.twitter.Tweet;

public class PokemonOnlyAnswerHisOwner implements SmartCell {
		
		
	public String ask(Tweet question) {
		
		Pattern pattern = Pattern.compile("@([^ ]+) #attack #([^ ]+) @([^ ]+)");
		Matcher matcher = pattern.matcher(question.getText());
		
		if (matcher.matches() && question.getScreenName() != null)
		{
			String NomPokemon = matcher.group(1); 
			String NomAttack = matcher.group(2);
			String NomVictime = matcher.group(3);
			
			if (question.getScreenName() != )
				return question.getScreenName() + + " is my owner";
			
			PokemonAttackCell();
		}
		
			
		
		
					
	        
	    }
}