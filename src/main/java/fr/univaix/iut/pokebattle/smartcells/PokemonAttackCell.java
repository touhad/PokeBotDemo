package fr.univaix.iut.pokebattle.smartcells;

import fr.univaix.iut.pokebattle.Pokemon;
import fr.univaix.iut.pokebattle.SmartCell;
import fr.univaix.iut.pokebattle.Tweet;

public class PokemonAttackCell implements SmartCell {
	
	Pokemon Magicarpe = new Pokemon("@Magicarpe");
	Pokemon Rondoudou = new Pokemon("@Rondoudou");

	@Override
	public String ask(Tweet question) {
		Magicarpe.setEleveur("@PoussinPiot");
		if (Magicarpe.getEleveur() != null)
			return Magicarpe.getEleveur() + " is my owner";
		
		return Rondoudou + " #Trempette !" + " cc/" + Magicarpe.getEleveur();
	}

}
