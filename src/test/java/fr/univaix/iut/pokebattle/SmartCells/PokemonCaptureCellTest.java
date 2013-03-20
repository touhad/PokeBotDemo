package fr.univaix.iut.pokebattle.SmartCells;

import static org.junit.Assert.*;
import fr.univaix.iut.pokebattle.Pokemon;
import fr.univaix.iut.pokebattle.Tweet;
import fr.univaix.iut.pokebattle.smartcells.PokemonCaptureCell;
import org.junit.Test;

public class PokemonCaptureCellTest {
	    
		PokemonCaptureCell cell = new PokemonCaptureCell();
		Pokemon Magicarpe = new Pokemon ("@RamolossPiot", "Eau", "Argneu", "Rouge royal", "@Alex", "Leviator",
				  null, "Blourf Blourf", 129, 0, 1, 100, 100, 10, 21, 9);
		/*
	    @Test
	    public void testCapturePokemon() {
	        assertEquals("@AlexPanizziG4 @Alex is my Owner", cell.ask(new Tweet("@RamolossPiot Pokeball!")));
	    }
		*/
}
