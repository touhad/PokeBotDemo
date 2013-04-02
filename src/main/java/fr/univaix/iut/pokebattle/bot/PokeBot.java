package fr.univaix.iut.pokebattle.bot;

import fr.univaix.iut.pokebattle.smartcell.*;
import fr.univaix.iut.pokebattle.twitter.Tweet;


public class PokeBot implements Bot {
    /**
     * List of smartcell the questions go through to
     * find an answer.
     */
    final SmartCell[] smartCells = new SmartCell[]{

            new PokemonOwnerCell(),
            new PokemonIndiqueEleveur(),
            new PokemonCaptureCell(),
            new PokemonCriesGeneCell(),
            new PokemonAttackCell(),
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
                return question.getScreenName() + " " + answer;


        }
        return null;
    }

}
