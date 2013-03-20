package fr.univaix.iut.pokebattle.smartcells;

import fr.univaix.iut.pokebattle.PokeBot;

public class PokemonKOCell {

	
	public String KO (PokeBot Poke) 
	{
		String strKO = new String ("#ArghBlurgblbl.." + "/cc" 
								+ Poke.juge() + Poke.Adv() 
								+ Poke.Owner());
		if (! Poke.vie()) return strKO;

	}

}
