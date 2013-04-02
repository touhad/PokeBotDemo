package fr.univaix.iut.pokebattle.SmartCells;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.univaix.iut.pokebattle.Pokemon;
import fr.univaix.iut.pokebattle.smartcell.PokemonCriesGeneCell;
import fr.univaix.iut.pokebattle.twitter.Tweet;

public class PokemonCriesGeneCellTest {
	
    
    @Test
    public void testSalut() {
    	PokemonCriesGeneCell cell = new PokemonCriesGeneCell();
        Pokemon Magicarpe = new Pokemon();
        Magicarpe.setCri("Carpe Carpe Magicarpe");
        assertEquals("Carpe Carpe Magicarpe", cell.ask(new Tweet("Salut @MagicarpePiot")));
    }

}
