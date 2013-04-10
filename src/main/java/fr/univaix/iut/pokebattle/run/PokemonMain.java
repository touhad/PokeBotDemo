package fr.univaix.iut.pokebattle.run;

import java.io.File;
import java.io.FilenameFilter;

import fr.univaix.iut.pokebattle.bot.PokeBot;

public class PokemonMain 
{
	
	
	private static String[] fileList = {"Magicarpe.properties", 
		"Ramoloss.properties",
		
		};
    public static void main(String[] args) 
    {
    	for (String credentialsFileName : fileList)
    	{
    		BotRunner.runBot(new PokeBot(), credentialsFileName);
    	}
    }
}
