package fr.univaix.iut.pokebattle.smartcell;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.univaix.iut.pokebattle.twitter.Tweet;

public class PokemonAttackCellTest {

	PokemonAttackCell cell = new PokemonAttackCell();

    @Test
    public void testSalut() {
        assertEquals("@Rondoudou #attack #trempette! /cc @PoussinPiot", cell.ask(new Tweet("@MagicarpePiot #attack #trempette! @Rondoudou")));
    }

}
