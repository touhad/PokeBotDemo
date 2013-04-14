package fr.univaix.iut.pokebattle.smartcell;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import fr.univaix.iut.pokebattle.DAOFactoryJPA;
import fr.univaix.iut.pokebattle.DAOPokemon;
import fr.univaix.iut.pokebattle.Pokemon;
import fr.univaix.iut.pokebattle.twitter.Tweet;

public class PokemonCaracCell implements SmartCell {

	@Override
	public String ask(Tweet question)
	{
		
		Pattern pattern = Pattern.compile("([^ ]+) #stat #([^ ]+) ?");
		Matcher matcher = pattern.matcher(question.getText());
		
		String text = question.getText();
					
		if(text.contains("#stat")) {
			String NomPokemon = matcher.group(1);
			String NomStat = matcher.group(2);
			System.out.println(NomPokemon);
			System.out.println(NomStat);
			
	        DAOPokemon DAO = DAOFactoryJPA.createDAOPokemon();
	        Pokemon pokemon = DAO.getById(NomPokemon);
	        
	        
		        if (NomStat == "Caractere") {
		        	String ValeurStat = pokemon.getCaractere();
		        	System.out.println("@"+ question.getScreenName() +" #" + NomStat +"="+ ValeurStat);
		        	return "@"+ question.getScreenName() +" #" + NomStat +"="+ ValeurStat;
		        }

		        if (NomStat == "Niveau") {
		        	int ValeurStat = pokemon.getNiveau();
		        	System.out.println("@"+ question.getScreenName() +" #" + NomStat +"="+ ValeurStat);
		        	return "@"+ question.getScreenName() +" #" + NomStat +"="+ ValeurStat;
		        }
		        
		        if (NomStat == "Experience") {
		        	int ValeurStat = pokemon.getExperience();
		        	System.out.println("@"+ question.getScreenName() +" #" + NomStat +"="+ ValeurStat);
		        	return "@"+ question.getScreenName() +" #" + NomStat +"="+ ValeurStat;
		        }
			        			        	        	
		        if (NomStat == "VieActuel") {
		        	int ValeurStat = pokemon.getVieActuel();
		        	System.out.println("@"+ question.getScreenName() +" #" + NomStat +"="+ ValeurStat);
		        	return "@"+ question.getScreenName() +" #" + NomStat +"="+ ValeurStat + " /100";
		        }
	        	

	 }		
		return "allo quoi";
	}
}
