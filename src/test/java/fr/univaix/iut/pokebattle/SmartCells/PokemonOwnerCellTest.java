package fr.univaix.iut.pokebattle.SmartCells;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.univaix.iut.pokebattle.smartcell.PokemonOwnerCell;
import fr.univaix.iut.pokebattle.twitter.Tweet;

public class PokemonOwnerCellTest {
	PokemonOwnerCell cell = new PokemonOwnerCell();
	
	@Test
	public void testOwner(){
		assertEquals("No owner", cell.ask(new Tweet("Owner ?")));
	}

}
