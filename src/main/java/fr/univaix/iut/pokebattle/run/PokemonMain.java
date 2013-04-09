package fr.univaix.iut.pokebattle.run;

import java.io.File;
import java.io.FilenameFilter;

import fr.univaix.iut.pokebattle.bot.PokeBot;

public class PokemonMain 
{
	
	
/*	File[] fichiersJava = res.listFiles(new FilenameFilter()
	{
		public boolean accept(File dir) 
		{
		  String name = new String();
		  return name.endsWith(".properties");
		}
	});	  */  
    public static void main(String[] args) 
    {
    	File res = new File("resources");
    	for (File PropFile : res.listFiles())
    	{
    		String Prop = new String (PropFile.getName());
    		BotRunner.runBot(new PokeBot(), Prop);
    	
    	//BotRunner.runBot(new PokeBot(), "Magicarpe.properties");
        //BotRunner.runBot(new PokeBot(), "Ramoloss.properties");
    	}
    }
}
