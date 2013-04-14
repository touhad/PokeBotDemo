

package fr.univaix.iut.pokebattle.SmartCells;

import static org.junit.Assert.assertEquals;

import java.util.GregorianCalendar;

import org.junit.Test;

import fr.univaix.iut.pokebattle.smartcells.PokemonCaracCell;
import fr.univaix.iut.pokebattle.twitter.Tweet;

public class PokemonCaracCellTest 
{
    PokemonCaracCell stat = new PokemonCaracCell ();

    @Test
    public void askLevel() 
    {
        assertEquals("@PoussinPiot #level=1 " , stat.ask(new Tweet("PoussinPiot", "@MagicarpePiot #stat #level ?")));
    }

}


