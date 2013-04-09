package fr.univaix.iut.pokebattle.run;

import java.io.File;

import fr.univaix.iut.pokebattle.bot.PokeBot;

public class PokemonMain 
{
	
	
    public static void main(String[] args) 
    {
        BotRunner.runBot(new PokeBot(), "Magicarpe.properties");
        BotRunner.runBot(new PokeBot(), "Ramoloss.properties");
    }
}
