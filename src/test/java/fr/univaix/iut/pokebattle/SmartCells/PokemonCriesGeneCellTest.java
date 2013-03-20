package fr.univaix.iut.pokebattle.SmartCells;

import fr.univaix.iut.pokebattle.Tweet;
import fr.univaix.iut.pokebattle.Pokemon;
import fr.univaix.iut.pokebattle.smartcells.PokemonCriesGeneCell;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PokemonCriesGeneCellTest {
	
    
    @Test
    public void testSalut() {
    	PokemonCriesGeneCell cell = new PokemonCriesGeneCell();
        Pokemon Magicarpe = new Pokemon("@MagicarpePiot");
        Magicarpe.setCri("Carpe Carpe Magicarpe");
        assertEquals("Carpe Carpe Magicarpe", cell.ask(new Tweet("Salut @MagicarpePiot")));
    }

}
