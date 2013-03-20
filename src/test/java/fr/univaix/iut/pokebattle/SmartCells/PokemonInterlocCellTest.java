package fr.univaix.iut.pokebattle.SmartCells;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.univaix.iut.pokebattle.Tweet;
import fr.univaix.iut.pokebattle.smartcells.*;

public class PokemonInterlocCellTest 
{
	PokemonInterlocCell cell = new PokemonInterlocCell();

    @Test
    public void testSalut() {
        assertEquals("Pika pika you bastard!", cell.ask(new Tweet("Salut!")));
    }

    @Test
    public void testNotSalut() {
        assertEquals("Pika pika", cell.ask(new Tweet("au revoir")));
    }
	

}
