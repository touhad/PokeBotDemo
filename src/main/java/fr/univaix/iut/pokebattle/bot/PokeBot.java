package fr.univaix.iut.pokebattle.bot;

import java.util.GregorianCalendar;

import fr.univaix.iut.pokebattle.smartcell.PokemonAnswerCell;
import fr.univaix.iut.pokebattle.smartcell.PokemonCaptureCell;
import fr.univaix.iut.pokebattle.smartcell.PokemonCriesCell;
import fr.univaix.iut.pokebattle.smartcell.PokemonCriesGeneCell;
import fr.univaix.iut.pokebattle.smartcell.PokemonIndiqueEleveur;
import fr.univaix.iut.pokebattle.smartcell.PokemonOwnerCell;
import fr.univaix.iut.pokebattle.smartcell.SmartCell;
import fr.univaix.iut.pokebattle.twitter.Tweet;


public class PokeBot implements Bot {
    /**
     * List of smartcell the questions go through to
     * find an answer.
     */
    final SmartCell[] smartCells = new SmartCell[]{

    		new PokemonCaptureCell(), 
    		new PokemonOwnerCell(),
            new PokemonAnswerCell(), 
            new PokemonOwnerCell(), 
            new PokemonIndiqueEleveur(),
            

    };

    /**
     * Ask something to Bot, it will respond to you.
     *
     * @param question The question you ask.
     * @return An answer... or null if it doesn't get it.
     */
    @Override
    public String ask(Tweet question) {
    	for (SmartCell cell : smartCells) {
            String answer = cell.ask(question);
            if (answer != null)
                return question.getScreenName()+ " " + answer + new GregorianCalendar (); 
            
            
        }
        return null;
    }

}
