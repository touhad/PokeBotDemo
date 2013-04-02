package fr.univaix.iut.pokebattle.smartcell;

import fr.univaix.iut.pokebattle.Pokemon;
import fr.univaix.iut.pokebattle.twitter.Tweet;

public class PokemonOwnerCell implements SmartCell {

    Pokemon Magicarpe = new Pokemon();

    @Override
    public String ask(Tweet question) {
        Magicarpe.setEleveur("@PoussinPiot");
        if (Magicarpe.getEleveur() == null)
            return "No owner";

        return Magicarpe.getEleveur() + " is my owner";
    }


}
