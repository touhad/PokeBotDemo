package fr.univaix.iut.pokebattle.run;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import fr.univaix.iut.pokebattle.bot.PokeBot;
import fr.univaix.iut.pokebattle.twitter.Tweet;

public class PokemonMain 
{
	String Properties = new String ("twitter4j.properties");
	
	
	public String Prop (Tweet question)
	{
		String NomPokemon = new String ();
		Pattern pattern = Pattern.compile("@([^ ]+)");
		Matcher matcher = pattern.matcher(question.getText());
		if(matcher.find() && question.getScreenName() != null)
		{
			NomPokemon = matcher.group(1); 
		}
		
		
		return NomPokemon+".properties";
	}
	//Regarder tweet, extraire nom pokemon, appeler properties qui va bien

	public static void main(String[] args) {
    	
        BotRunner.runBot(new PokeBot(), Prop(question)); // problème, comment récupérer le tweet de façon effective ?
    }
}
