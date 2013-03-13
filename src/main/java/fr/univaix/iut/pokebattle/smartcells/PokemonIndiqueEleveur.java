package fr.univaix.iut.pokebattle.smartcells;

import fr.univaix.iut.pokebattle.SmartCell;
import fr.univaix.iut.pokebattle.Tweet;

public class PokemonIndiqueEleveur implements SmartCell {

	String eleveur = new String();
	
	@Override
	public String ask(Tweet question) {
		if (eleveur == null )
			return "No owner";

		return eleveur + "is my owner";
	}

}
