package fr.univaix.iut.pokebattle.run;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import fr.univaix.iut.pokebattle.bot.PokeBot;
import fr.univaix.iut.pokebattle.smartcell.SmartCell;
import fr.univaix.iut.pokebattle.twitter.Tweet;

public class PokemonMain implements SmartCell
{
	Properties Prop = new Properties ();
	@Override
	public String ask(Tweet question) {
		
		return null;
	}

	
		
	//Regarder tweet, extraire nom pokemon, appeler properties qui va bien

	public static void main(String[] args) 
	{
    	
        BotRunner.runBot(new PokeBot(), Prop); // problème, comment récupérer le tweet de façon effective ?
    }

	
	
}
