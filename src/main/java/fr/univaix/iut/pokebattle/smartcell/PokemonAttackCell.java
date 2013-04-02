package fr.univaix.iut.pokebattle.smartcell;

import fr.univaix.iut.pokebattle.Pokemon;
import fr.univaix.iut.pokebattle.twitter.Tweet;

public class PokemonAttackCell implements SmartCell {
	
	Pokemon Magicarpe = new Pokemon("@MagicarpePiot");
	Pokemon Rondoudou = new Pokemon("@Rondoudou");

	@Override
	public String ask(Tweet question) {
		Magicarpe.setEleveur("@PoussinPiot");
		if (Magicarpe.getEleveur() != null)
			return Rondoudou.getNom() + " #attack #trempette! /cc " + Magicarpe.getEleveur();
		
		return "No owner";
	}
}
