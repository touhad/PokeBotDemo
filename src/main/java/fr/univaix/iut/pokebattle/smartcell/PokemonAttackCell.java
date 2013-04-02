package fr.univaix.iut.pokebattle.smartcell;

import fr.univaix.iut.pokebattle.Pokemon;
import fr.univaix.iut.pokebattle.twitter.Tweet;

public class PokemonAttackCell implements SmartCell {
	
	Pokemon Magicarpe = new Pokemon();
	Pokemon victime = new Pokemon();

	@Override
	public String ask(Tweet question) {
		Magicarpe.setEleveur("@PoussinPiot");
		if (Magicarpe.getEleveur() != null)
			return "@" + victime.getNom() + " #attack #trempette! /cc " + Magicarpe.getEleveur();
		
		return "No owner";
	}
}
