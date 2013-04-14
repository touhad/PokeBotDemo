package fr.univaix.iut.pokebattle.smartcell;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import fr.univaix.iut.pokebattle.Pokemon;
import fr.univaix.iut.pokebattle.twitter.Tweet;

public class PokemonCaracCell implements SmartCell {


  @Override
  public String ask(Tweet question)
  {
    Pattern pattern = Pattern.compile("@([^ ]+) #stat #([^ ]+) ?");
    Matcher matcher = pattern.matcher(question.getText());

    if(matcher.matches() && question.getScreenName() != null){
    String NomPokemon = matcher.group(1);
    String NomAttack = matcher.group(2);

    return "@"+ question.getScreenName() +" #" + NomStat +"="+ Pokemon.getStat(NomPokemon,NomStat);
  }
  return null;
}
