package fr.univaix.iut.pokebattle.smartcell;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import fr.univaix.iut.pokebattle.DAOFactoryJPA;
import fr.univaix.iut.pokebattle.DAOPokemon;
import fr.univaix.iut.pokebattle.Pokemon;
import fr.univaix.iut.pokebattle.twitter.Tweet;

public class JugeAttaqueCell implements SmartCell {
	

	@Override
	public String ask(Tweet question) {
		
		// On créé un  pattern qui correspond à l'exprssion de la question de l'éléveur
		//"@pikachuNyanNian #attack #charge /cc @nedseb @pcreux @viviane"
		Pattern pattern = Pattern.compile("([^ ]+) #attack #([^ ]+) /cc ([^ ]+) ([^ ]+) ([^ ]+)");
		
		// On match le pattern pour récupérer les groupes de l'expression
		// Tout ce qui est entre parenthèses correspond à un groupe
		// Le groupe zéro correspond à toute l'expression en entier
		Matcher matcher = pattern.matcher(question.getText());
		
		// Si le match marche et que le ScreenName n'est pas null alors on passe le if
		if(matcher.matches() && question.getScreenName() != null){
			// On fait correspondre les groupes avec "@pikachuNyanNian(groupe 1) #attack #charge(groupe 2)! /cc @nedseb(groupe 3) @pcreux(groupe 4) @viviane(groupe 5)"
			
			String NomPokemonV = matcher.group(1);	//Nom du pokemon attaqué (victime)
			String NomAttack = matcher.group(2);	//Nom de l'attaque lancé
			String EleveurV = matcher.group(3);		//Nom de l'éleveur du pokemon attaqué
	        String EleveurA = matcher.group(4);		//Nom de l'éleveur du pokemon attaquant
			String NomJuge = matcher.group(5);		//Nom du juge pour ce combat
			
			String NomPokemonA = question.getScreenName(); //Nom du pokemon attaquant
			
			/*Creation des DAO et des entités*/
			DAOPokemon DAOV = DAOFactoryJPA.createDAOPokemon();
	        Pokemon pokemonV = DAOV.getById(NomPokemonV);
	        
			DAOPokemon DAOA = DAOFactoryJPA.createDAOPokemon();
	        Pokemon pokemonA = DAOA.getById(NomPokemonA); 
	        
	        /*
			DAOAttaque DAO_attack = DAOFactoryJPA.createDAOAttaque();
	        Attaque attaque = DAO_attack.getById(NomAttack);
	        */
	        
	        /*Gestion des degats*/	        
	        int vie = pokemonV.getVieActuel();
	        int degat = 10/*attaque.getPuissance()*/; //pour le moment toutes les attaques font 10 dégats
	        vie = vie - degat;
	        
	        if (vie < 0)
	        	vie = 0;
	        
	        pokemonV.setVieActuel(vie);
	        
			System.out.println(NomJuge + " : " + NomPokemonV + " -" + degat + "pv /cc " + EleveurV + ' ' + EleveurA); //test
			
			//"@pikachuNyanNian -10pv /cc @nedseb"
			return NomPokemonV + " -" + degat + "pv /cc " + EleveurV + EleveurA;

		}
		System.out.println("null");
		return null;
	}
}
