package fr.univaix.iut.pokebattle;


import fr.univaix.iut.pokebattle.smartcells.PokemonCriesCell;
<<<<<<< HEAD
import fr.univaix.iut.pokebattle.smartcells.PokemonInterlocCell;
=======
import fr.univaix.iut.pokebattle.smartcells.PokemonOwnerCell;
>>>>>>> F-3-pokemon-indique-eleveur


public class PokeBot implements Bot {
    /**
     * List of SmartCells the questions go through to
     * find an answer.
     */
<<<<<<< HEAD
    final SmartCell[] smartCells = new SmartCell[]
    {
            new PokemonInterlocCell(), new PokemonCriesCell()
            
=======
    final SmartCell[] smartCells = new SmartCell[]{
    		new PokemonOwnerCell(), new PokemonCriesCell() 
>>>>>>> F-3-pokemon-indique-eleveur
    };

    /**
     * Ask something to BoBot, it will respond to you.
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
