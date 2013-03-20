package fr.univaix.iut.pokebattle.SmartCells;

import static org.junit.Assert.*;
import fr.univaix.iut.pokebattle.Tweet;
import fr.univaix.iut.pokebattle.smartcells.PokemonCaptureCell;
import org.junit.Test;

public class PokemonCaptureCellTest {
	    
		PokemonCaptureCell cell = new PokemonCaptureCell();
	
	    @Test
	    public void testCapturePokemon() {
	        assertEquals("@Alex @Alex is my Owner", cell.ask(new Tweet("@Mewtwo Pokeball!")));
	    }
	
}
