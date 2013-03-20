package fr.univaix.iut.pokebattle.smartcells;

import fr.univaix.iut.pokebattle.Pokemon;
import fr.univaix.iut.pokebattle.SmartCell;
import fr.univaix.iut.pokebattle.Tweet;

/**
 * Reply to all.
 */
public class PokemonCriesGeneCell implements SmartCell {

    public String ask(Tweet question) {
    	
                
        return "@" + question.getScreenName() +" Carpe Carpe Magicarpe";
    }
    

	private String extractName(Tweet question) {
		
		String q = new String(question.getText());		
		String bits[] = q.split("Salut ");
		String name = bits[bits.length - 1];
		
		return name;
	}

}