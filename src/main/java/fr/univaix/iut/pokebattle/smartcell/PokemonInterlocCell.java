package fr.univaix.iut.pokebattle.smartcell;

import fr.univaix.iut.pokebattle.twitter.Tweet;

public class PokemonInterlocCell implements SmartCell {
    String Interloc = new String("You bastard!");

    public String ask(Tweet question) {
        // Interloc = "@Author du tweet";
        String retour = new String("Pika pika" + Interloc);
        return "Pika pika";
    }



}
