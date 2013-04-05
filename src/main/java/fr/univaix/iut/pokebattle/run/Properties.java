package fr.univaix.iut.pokebattle.run;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import fr.univaix.iut.pokebattle.smartcell.SmartCell;
import fr.univaix.iut.pokebattle.twitter.Tweet;

public class Properties implements SmartCell
{
	@Override
	public String ask(Tweet question) {
		
		return Prop (question);
	}
	public String Prop (Tweet question)
	{
		String NomPokemon = new String ();
		Pattern pattern = Pattern.compile("@([^ ]+)");
		Matcher matcher = pattern.matcher(question.getText());
		if(matcher.find() && question.getScreenName() != null)
		{
			NomPokemon = matcher.group(1); 
		}
		
		return NomPokemon + ".properties";
	}
}
