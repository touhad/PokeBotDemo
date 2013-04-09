package fr.univaix.iut.pokebattle.run;

import fr.univaix.iut.pokebattle.bot.PokeBot;
import fr.univaix.iut.pokebattle.twitter.Tweet;

public class PokemonMain
{
	Properties Prop = new Properties ();
	
	public String ask(Tweet question)
	{
		
		String PropFile = Prop.ask(question);
		return PropFile;

	}

	
		
	//Regarder tweet, extraire nom pokemon, appeler properties qui va bien

	public static void main(String[] args) 
	{
		
			BotRunner.runBot(new PokeBot(), PropFile); 
		
	}

	
	
}
