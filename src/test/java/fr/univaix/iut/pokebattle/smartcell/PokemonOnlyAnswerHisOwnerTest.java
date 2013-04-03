package fr.univaix.iut.pokebattle.smartcell;

import fr.univaix.iut.pokebattle.twitter.Tweet;
import static org.junit.Assert.assertEquals;

public class PokemonOnlyAnswerHisOwnerTest {
	PokemonOnlyAnswerHisOwner cell = new PokemonOnlyAnswerHisOwner();
    
    
    public void TestRep () {
    	assertEquals ("@PoussinPiot is my owner" , cell.ask(new Tweet("@RamolossPiot #attack #trempette @MagicarpePiot")));
    }

    
}