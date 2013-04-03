package fr.univaix.iut.pokebattle.smartcell;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import fr.univaix.iut.pokebattle.Pokemon;
import fr.univaix.iut.pokebattle.twitter.Tweet;

public class PokemonCaracCell implements SmartCell
{
	@Override
	public String ask(Tweet question) {
		// On créé un  pattern qui correspond à l'exprssion de la question de l'éléveur
		Pattern pattern = Pattern.compile("@([^ ]+) caracteristiques **");
		
		// On match le pattern pour récupérer les groupes de l'expression
		// Tout ce qui est entre parenthèses correspond à un groupe
		// Le groupe zéro correspond à toute l'expression en entier
		Matcher matcher = pattern.matcher(question.getText());
		
		// Si le match marche et que le ScreenName n'est pas null alors on fait le if
		if(matcher.matches() && question.getScreenName() != null){
			// On fait correspondre les groupes avec "@bulbizare1(groupe 1) #attack #foudre(groupe 2)! /cc @pcreux(groupe 3)"
			String NomPokemon = matcher.group(1);
			
			Pokemon Poke = new Pokemon ();
			
			
			return "Nom: " + Poke.getNom() + "\n" +
				   "Type: " + Poke.getType() + "\n" +
				   "Caractere: " + Poke.getCaractere() + "\n" +
				   "Couleur: " + Poke.getCouleur() + "\n" +
				   "Eleveur: " + Poke.getEleveur() + "\n" +
				   "Evolution: " + Poke.getEvolution() + "\n" +
				   "Prevolution: " + Poke.getPrevolution() + "\n" +
				   "Cri: " + Poke.getCri() + "\n" +
				   "Id: " + Poke.getNum () + "\n" +
				   "xp: " + Poke.getExperience() + "\n" +
				   "Niveau: " + Poke.getNiveau() + "\n" +
				   "Vie: " + Poke.getVieActuel()+
				   "/"     + Poke.getVieMax() + "\n" +
				   "Attaque(s): " + Poke.getAttaque() + "\n"+
				   "Taille: " + Poke.getTaille() + "\n" +
				   "Poids: " + Poke.getPoid() + "\n" ;
		}
		return null;
	}

}
