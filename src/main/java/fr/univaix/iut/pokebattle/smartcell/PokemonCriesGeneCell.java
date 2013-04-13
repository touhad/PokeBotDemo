package fr.univaix.iut.pokebattle.smartcell;

import fr.univaix.iut.pokebattle.DAOFactoryJPA;
import fr.univaix.iut.pokebattle.DAOPokemon;
import fr.univaix.iut.pokebattle.Pokemon;
import fr.univaix.iut.pokebattle.twitter.Tweet;

/**
 * Reply to all.
 */
public class PokemonCriesGeneCell implements SmartCell {
	
	

    public String ask(Tweet question) {
    	
    	String Twitteur = question.getScreenName();
        String q = new String(question.getText());
        String bits[] = q.split(" ");
        String pkm = bits[0];
        
        DAOPokemon DAO = DAOFactoryJPA.createDAOPokemon();
        Pokemon pokemon = DAO.getById(pkm);
        
        String Cri = pokemon.getCri();

        System.out.println(Cri + Twitteur);


        return Twitteur + " " + Cri + ".."  ;
    }
}