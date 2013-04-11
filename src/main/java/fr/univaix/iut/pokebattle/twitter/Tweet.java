package fr.univaix.iut.pokebattle.twitter;

public class Tweet {
    private String text;
    private String screenName;
    private String pokemonName;

    public Tweet(String text) {
        this.text = text;
    }

    public Tweet(String screenName, String text, String pokemonName) {
        this.screenName = screenName;
        this.text = text;
        this.pokemonName = pokemonName;
    }

    public String getScreenName() {
        return "@" + screenName;
    }
    public String getPokemonName()
    {
    	return pokemonName;
    }
    public String getText() {
        return text;
    }

}
