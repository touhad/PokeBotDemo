package fr.univaix.iut.pokebattle.smartcell;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import fr.univaix.iut.pokebattle.DAOFactoryJPA;
import fr.univaix.iut.pokebattle.DAOPokemon;
import fr.univaix.iut.pokebattle.Pokemon;
import fr.univaix.iut.pokebattle.twitter.Tweet;

public class PokemonAttackCell implements SmartCell {
	

	@Override
	public String ask(Tweet question) {
		
		// On créé un  pattern qui correspond à l'exprssion de la question de l'éléveur
		//"@bulbizare1 #attack #charge @pikachuNyanNian /cc @nedseb @viviane"
		Pattern pattern = Pattern.compile("([^ ]+) #attack #([^ ]+) ([^ ]+) /cc ([^ ]+) ([^ ]+)");
		
		// On match le pattern pour récupérer les groupes de l'expression
		// Tout ce qui est entre parenthèses correspond à un groupe
		// Le groupe zéro correspond à toute l'expression en entier
		Matcher matcher = pattern.matcher(question.getText());
		
		// Si le match marche et que le ScreenName n'est pas null alors on fait le if
		if(matcher.matches() && question.getScreenName() != null){
			// On fait correspondre les groupes avec "@bulbizare1(groupe 1) #attack #foudre(groupe 2)! @pikachuNyanNian(groupe 3) /cc @pcreux(groupe 4) @viviane(groupe 5)"
			String NomPokemon = matcher.group(1); 
			String NomAttack = matcher.group(2);
			String NomVictime = matcher.group(3);
	        String NomDresseurVictime = matcher.group(4);
			String NomJuge = matcher.group(5);
			
			DAOPokemon DAO = DAOFactoryJPA.createDAOPokemon();
	        Pokemon pokemon = DAO.getById(NomPokemon);

	        String eleveur = pokemon.getEleveur();
	        String twitteur = question.getScreenName();
	        
	        if (!(eleveur.equals(twitteur)))
	        {
	        	System.out.println(NomPokemon + " : " + question.getScreenName() + ' ' + eleveur + " is my owner"); //test
	        	return question.getScreenName() + ' ' + eleveur + " is my owner";
	        }
	        
	        //Probleme avec la BD
	        /*
			DAOAttaque DAO_attack = DAOFactoryJPA.createDAOAttaque();
	        Attaque attaque = DAO_attack.getById(NomAttack);
	        
	        if (pokemon.getType() != attaque.getTypeAttaque())
	        {
	        	System.out.println(NomPokemon + " : " + eleveur + ' ' + attaque + " is not in my type."); //test
	        	return eleveur + ' ' + attaque + " is not in my type.";
	        }	        
	        */
			
			System.out.println(NomPokemon + " : " + "" + NomVictime + " #attack #" + NomAttack + "! /cc " + NomDresseurVictime + " " + eleveur + " " + NomJuge); //test
			
			return NomVictime + " #attack #" + NomAttack + "! /cc " + NomDresseurVictime + " " + eleveur + " " + NomJuge;

		}
		System.out.println("null");
		return null;
	}
}
