package fr.univaix.iut.pokebattle.SmartCells;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.univaix.iut.pokebattle.smartcell.PokemonCaptureCell;
import fr.univaix.iut.pokebattle.twitter.Tweet;

public class PokemonCaptureCellTest {
	    
		PokemonCaptureCell cell = new PokemonCaptureCell();
	
	    @Test
	    public void testCapturePokemon() {
	        assertEquals("@Alex @Alex is my owner", cell.ask(new Tweet("@Mewtwo Pokeball!")));
	    }
	
}
