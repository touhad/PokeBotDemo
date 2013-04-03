package fr.univaix.iut.pokebattle.smartcell;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.univaix.iut.pokebattle.twitter.Tweet;

public class PokemonVictimOwnerCellTest {
	
	PokemonVictimOwnerCell cell = new PokemonVictimOwnerCell();
	
	@Test
	public void testVictimOwner() {
		assertEquals("@Ramoloss #attack #trempette! /cc @JeanJacques @PoussinPiot",
				cell.ask(new Tweet("PoussinPiot", "@MagicarpePiot #attack #trempette @Ramoloss /cc @JeanJacques")));
	}

}
