package fr.univaix.iut.pokebattle.SmartCells;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.univaix.iut.pokebattle.Pokemon;
import fr.univaix.iut.pokebattle.Tweet;
import fr.univaix.iut.pokebattle.smartcells.PokemonInterlocCell;


public class PokemonInterlocCellTest {
	
	PokemonInterlocCell cell = new PokemonInterlocCell();
	
	@Test
	public void TestInterloc() {
		Pokemon Magicarpe = new Pokemon("@MagicarpePiot");
		Magicarpe.setCri("Carpe Carpe Magicarpe");
		assertEquals("@PoussinPiot", cell.ask(new Tweet("PoussinPiot", "Salut !")));
	}

}
