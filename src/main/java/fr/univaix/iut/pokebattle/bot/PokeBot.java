package fr.univaix.iut.pokebattle.bot;

<<<<<<< HEAD:src/main/java/fr/univaix/iut/pokebattle/PokeBot.java

import fr.univaix.iut.pokebattle.smartcells.PokemonAttackCell;
import fr.univaix.iut.pokebattle.smartcells.PokemonCriesCell;
import fr.univaix.iut.pokebattle.smartcells.PokemonInterlocCell;
import fr.univaix.iut.pokebattle.smartcells.PokemonOwnerCell;

=======
import fr.univaix.iut.pokebattle.smartcell.PokemonCriesCell;
import fr.univaix.iut.pokebattle.smartcell.SmartCell;
import fr.univaix.iut.pokebattle.twitter.Tweet;
>>>>>>> master:src/main/java/fr/univaix/iut/pokebattle/bot/PokeBot.java


public class PokeBot implements Bot {
    /**
     * List of smartcell the questions go through to
     * find an answer.
     */

    final SmartCell[] smartCells = new SmartCell[] {
    		
           new PokemonAttackCell(),
           new PokemonOwnerCell(),
           new PokemonInterlocCell(),
           new PokemonCriesCell()
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
                return answer;
            
            
        }
        return null;
    }

}
