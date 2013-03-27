package fr.univaix.iut.pokebattle.SmartCells;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.univaix.iut.pokebattle.SmartCell;
import fr.univaix.iut.pokebattle.Tweet;
import fr.univaix.iut.pokebattle.smartcells.PokemonAttackCell;
import fr.univaix.iut.pokebattle.smartcells.PokemonCriesCell;

public class PokemonAttackCellTest {

	PokemonAttackCell cell = new PokemonAttackCell();

    @Test
    public void testSalut() {
        assertEquals("@Rondoudou #attack #trempette! /cc @PoussinPiot", cell.ask(new Tweet("@Magicarpe #attack #trempette! @Rondoudou")));
    }

}
