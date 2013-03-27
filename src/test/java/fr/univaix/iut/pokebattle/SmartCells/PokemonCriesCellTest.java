package fr.univaix.iut.pokebattle.SmartCells;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.univaix.iut.pokebattle.smartcell.PokemonCriesCell;
import fr.univaix.iut.pokebattle.twitter.Tweet;

public class PokemonCriesCellTest {

    PokemonCriesCell cell = new PokemonCriesCell();

    @Test
    public void testSalut() {
        assertEquals("Pika pika", cell.ask(new Tweet("Salut!")));
    }

    @Test
    public void testNotSalut() {
        assertEquals("Pika pika", cell.ask(new Tweet("au revoir")));
    }
}
