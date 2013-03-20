package fr.univaix.iut.pokebattle.smartcells;

import fr.univaix.iut.pokebattle.SmartCell;
import fr.univaix.iut.pokebattle.Tweet;
import fr.univaix.iut.pokebattle.Pokemon;

public class PokemonOwnerCell implements SmartCell {

	Pokemon Magicarpe = new Pokemon("@MagicarpePiot");
	
	@Override
	public String ask(Tweet question) {
		Magicarpe.setEleveur("@PoussinPiot");
		if ( Magicarpe.getEleveur() == null )
			return "No owner";

		return Magicarpe.getEleveur() + " is my owner";
	}


}
