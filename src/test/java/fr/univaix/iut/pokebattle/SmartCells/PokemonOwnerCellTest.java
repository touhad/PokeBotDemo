package fr.univaix.iut.pokebattle.SmartCells;

import static org.junit.Assert.assertEquals;
import fr.univaix.iut.pokebattle.Tweet;
import fr.univaix.iut.pokebattle.smartcells.PokemonOwnerCell;
import org.junit.Test;

public class PokemonOwnerCellTest {
	PokemonOwnerCell cell = new PokemonOwnerCell();
	
	@Test
	public void testOwner(){
		assertEquals("No owner", cell.ask(new Tweet("Owner ?")));
	}

}
