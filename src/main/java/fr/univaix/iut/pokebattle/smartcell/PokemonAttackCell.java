package fr.univaix.iut.pokebattle.smartcell;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import fr.univaix.iut.pokebattle.Pokemon;
import fr.univaix.iut.pokebattle.twitter.Tweet;

public class PokemonAttackCell implements SmartCell {
	

	@Override
	public String ask(Tweet question) {
		// On créé un  pattern qui correspond à l'exprssion de la question de l'éléveur
		Pattern pattern = Pattern.compile("@([^ ]+) #attack #([^ ]+) @([^ ]+) /cc @([^ ]+) @([^ ]+)");
		
		// On match le pattern pour récupérer les groupes de l'expression
		// Tout ce qui est entre parenthèses correspond à un groupe
		// Le groupe zéro correspond à toute l'expression en entier
		Matcher matcher = pattern.matcher(question.getText());
		
		// Si le match marche et que le ScreenName n'est pas null alors on fait le if
		if(matcher.find() && question.getScreenName() != null){
			// On fait correspondre les groupes avec "@bulbizare1(groupe 1) #attack #foudre(groupe 2)! /cc @pcreux(groupe 3)"
			String NomPokemon = matcher.group(1); 
			String NomAttack = matcher.group(2);
			String NomVictime = matcher.group(3);
			String NomDresseurVictime = matcher.group(4);
			String NomJuge = matcher.group(5);
			if (NomPokemon.equals(question.getPokemonName()))
			    return "@"+ NomVictime +" #attack #" + NomAttack +"! /cc @"+ NomDresseurVictime +" "+ question.getScreenName() +" @" +NomJuge;
			return "j'aime les pâtes";
		}
		return null;
	}
}
