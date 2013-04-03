package fr.univaix.iut.pokebattle.smartcell;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import fr.univaix.iut.pokebattle.twitter.Tweet;


public class PokemonVictimOwnerCell {

	public String ask(Tweet question) {
		
		Pattern pattern = Pattern.compile("@([^ ]+) #attack #([^ ]+) @([^ ]+) /cc @([^ ]+)");
		Matcher matcher = pattern.matcher(question.getText());
		
		if (matcher.matches()) {
			String NomPokemon = matcher.group(1); 
			String NomAttack = matcher.group(2);
			String NomVictime = matcher.group(3);
			String NomEleveurVictime = matcher.group(4);
			
			return "@"+ NomVictime +" #attack #" + NomAttack +"! /cc @"+ NomEleveurVictime + " " +  question.getScreenName();

		}
		
		return null;
	}
	

}
