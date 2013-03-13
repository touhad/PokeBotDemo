package fr.univaix.iut.pokebattle.smartcells;

import fr.univaix.iut.pokebattle.SmartCell;
import fr.univaix.iut.pokebattle.Tweet;

public class PokemonInterlocCell implements SmartCell
{
	String Interloc = new String ("you bastard!");
	public String ask(Tweet question) 
	{
	    String retour = new String (Interloc + "Pika pika");
		return "Pika pika";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
