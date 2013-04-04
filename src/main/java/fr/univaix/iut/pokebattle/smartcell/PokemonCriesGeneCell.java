package fr.univaix.iut.pokebattle.smartcell;

import fr.univaix.iut.pokebattle.twitter.Tweet;

/**
 * Reply to all.
 */
public class PokemonCriesGeneCell implements SmartCell {

    public String ask(Tweet question) {


        return "Carpe Carpe Magicarpe";
    }


    private String extractName(Tweet question) {

        String q = new String(question.getText());
        String bits[] = q.split("Salut ");
        String name = bits[bits.length - 1];

        return name;
    }

}