package fr.univaix.iut.pokebattle.smartcells;

import fr.univaix.iut.pokebattle.Pokemon;
import fr.univaix.iut.pokebattle.SmartCell;
import fr.univaix.iut.pokebattle.Tweet;

public class PokemonInterlocCell implements SmartCell
{
		
	public String ask(Tweet question) 
	{
		String Interloc = question.getScreenName();
		return "@" + Interloc;
		
	}

}
