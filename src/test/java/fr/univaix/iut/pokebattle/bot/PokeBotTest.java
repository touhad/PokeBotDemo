package fr.univaix.iut.pokebattle.bot;

import fr.univaix.iut.pokebattle.twitter.Tweet;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Integration tests checking the PokeBot
 * behavior. We just test some cases to make sure that the
 * PokeBot is using smartcell properly.
 */
public class PokeBotTest {
    PokeBot pokeBot = new PokeBot();

    @Ignore
    @Test
    public void testSalut() {
        assertEquals("Carpe Carpe Magicarpe", pokeBot.ask(new Tweet("Salut")));
        assertEquals("Carpe Carpe Magicarpe", pokeBot.ask(new Tweet("This is not a question.")));
        assertEquals("Pika pika", pokeBot.ask(new Tweet("Salut")));
        assertEquals("Pika pika", pokeBot.ask(new Tweet("This is not a question.")));
        assertEquals("@nedseb Pika pika", pokeBot.ask(new Tweet("nedseb Salut")));
        assertEquals("@nedseb Pika pika", pokeBot.ask(new Tweet("nedseb This is not a question.")));

    }
}
