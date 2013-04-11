package fr.univaix.iut.pokebattle.twitter;

public class Tweet {
    private String text;
    private String screenName;
    private String PokemonName;

    public Tweet(String text) {
        this.text = text;
    }


    public Tweet(String text, String screenName, String pokemonName) {
		super();
		this.text = text;
		this.screenName = screenName;
		PokemonName = pokemonName;
	}


	public String getPokemonName() {
		return PokemonName;
	}

	public String getScreenName() {
        return "@" + screenName;
    }

    public String getText() {
        return text;
    }

}
