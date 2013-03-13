package fr.univaix.iut.pokebattle.smartcells;

import fr.univaix.iut.pokebattle.SmartCell;
import fr.univaix.iut.pokebattle.Tweet;

public class PokemonInterlocCell implements SmartCell
{
	String Interloc = new String();
	public String ask(Tweet question) 
	{
		// Interloc = "@Author du tweet";
	    String retour = new String ("Pika pika" + Interloc);
		return "Pika pika";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
