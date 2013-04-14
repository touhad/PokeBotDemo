package fr.univaix.iut.pokebattle.smartcell;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import fr.univaix.iut.pokebattle.DAOFactoryJPA;
import fr.univaix.iut.pokebattle.DAOPokemon;
import fr.univaix.iut.pokebattle.Pokemon;
import fr.univaix.iut.pokebattle.twitter.Tweet;

public class PokemonKOCell implements SmartCell {
	

	@Override
	public String ask(Tweet question) {
		
		// On créé un  pattern qui correspond à l'exprssion de la question de l'éléveur
		//"@bulbizare1 -10pv /cc @pcreux"
		Pattern pattern = Pattern.compile("([^ ]+) -([^ ]+)pv /cc ([^ ]+) ([^ ]+)");
		
		// On match le pattern pour récupérer les groupes de l'expression
		// Tout ce qui est entre parenthèses correspond à un groupe
		// Le groupe zéro correspond à toute l'expression en entiere
		Matcher matcher = pattern.matcher(question.getText());
		
		// Si le match marche et que le ScreenName n'est pas null alors on passe le if
		if(matcher.matches() && question.getScreenName() != null){
			// On fait correspondre les groupes avec "@pikachuNyanNian(groupe 1) #attack #charge(groupe 2)! /cc @nedseb(groupe 3) @pcreux(groupe 4) @viviane(groupe 5)"
			
			String NomPokemon = matcher.group(1);	//Nom du pokemon attaqué (victime)
			String EleveurV = matcher.group(3);		//Nom de l'éleveur du pokemon attaqué
	        String EleveurA = matcher.group(4);		//Nom de l'éleveur du pokemon attaquant
	        String Juge = question.getScreenName(); //Nom du juge
			
			/*Creation des DAO et des entités*/
			DAOPokemon DAOV = DAOFactoryJPA.createDAOPokemon();
	        Pokemon pokemon = DAOV.getById(NomPokemon);
	        
	        /*Gestion du KO*/
	        int vie = pokemon.getVieActuel();
	        
	        if (vie == 0){
	        	System.out.println(NomPokemon + " : #KO /cc " + Juge + " " + EleveurA + " " + EleveurV);
	        	return "#KO /cc " + Juge + " " + EleveurA + " " + EleveurV; //"#KO /cc @JugePiot @SpaceDuck_42 @PoussinPiot"
	        }
	        System.out.println("Il n'est pas KO !");
	        return null;

		}
		System.out.println("null");
		return null;
	}
}
