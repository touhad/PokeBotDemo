package fr.univaix.iut.pokebattle;

import fr.univaix.iut.pokebattle.smartcells.PokemonAnswerCell;
import fr.univaix.iut.pokebattle.smartcells.PokemonCriesCell;


public class PokeBot implements Bot {
    /**
     * List of SmartCells the questions go through to
     * find an answer.
     */
    final SmartCell[] smartCells = new SmartCell[]{
            new PokemonCriesCell(), new PokemonAnswerCell()
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

	public String Adv() {
		// TODO Auto-generated method stub
		return null;
	}

	public String juge() {
		// TODO Auto-generated method stub
		return null;
	}

	public String Owner() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean vie() {
		// TODO Auto-generated method stub
		return false;
	}

}
