package fr.univaix.iut.pokebattle.smartcell;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.univaix.iut.pokebattle.Pokemon;
import fr.univaix.iut.pokebattle.twitter.Tweet;

public class PokemonAttackCellTest {

	PokemonAttackCell cell = new PokemonAttackCell();

    @Test
    public void testSalut() {
        assertEquals("@RamolossPiot #attack #trempette! /cc @PoussinPiot", 
        		cell.ask(new Tweet("PoussinPiot", "@MagicarpePiot #attack #trempette @RamolossPiot")));
    }

}
