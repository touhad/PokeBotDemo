package fr.univaix.iut.pokebattle.smartcells;

import fr.univaix.iut.pokebattle.SmartCell;
import fr.univaix.iut.pokebattle.Tweet;

public class PokemonAvecEleveur implements SmartCell {

	String eleveur = new String();
	
	@Override
	public String ask(Tweet question) {
		
		return eleveur + "is my owner";
	}

}
