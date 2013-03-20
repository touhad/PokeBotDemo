package fr.univaix.iut.pokebattle.SmartCells;

import fr.univaix.iut.pokebattle.Tweet;
import fr.univaix.iut.pokebattle.smartcells.PokemonCriesCell;
import org.junit.Test;

public class PokemonCaptureCellTest {
	    
	    @Test
	    public void testCapturePokemon() {
	        assertEquals("@Alex @Alex is my owner", cell.ask(new Tweet("@Mewtwo Pokeball!")));
	    }
	
}
