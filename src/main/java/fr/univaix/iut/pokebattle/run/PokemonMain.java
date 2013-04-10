package fr.univaix.iut.pokebattle.run;

import fr.univaix.iut.pokebattle.bot.PokeBot;

public class PokemonMain {
    public static void main(String[] args) {
    	//Regarder tweet, extraire nom pokemon, appeler properties qui va bien
        BotRunner.runBot(new PokeBot(), "twitter4j.properties");
    }
}
