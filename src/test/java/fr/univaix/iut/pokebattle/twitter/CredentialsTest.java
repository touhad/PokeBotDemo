package fr.univaix.iut.pokebattle.twitter;

import org.junit.Test;

import java.io.InputStream;

import static org.fest.assertions.Assertions.assertThat;

public class CredentialsTest {
    @Test
    public void testLoadCredentialsGivenAValidPropertiesFileShouldReturnAValidCredentials() throws Exception {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("./twitter4j.properties");
        Credentials credentials = Credentials.loadCredentials(inputStream);
        assertThat(credentials.getConsumerKey()).isEqualTo("mvhaJEk5wz1SSDB542wQ");
        assertThat(credentials.getConsumerSecret()).isEqualTo("go5wpDTW6G12zMPh7Kl1DwNuppPJ2aqTJ02nHN3bYw");
        assertThat(credentials.getToken()).isEqualTo("1264502713-wzUMiIUOgZK91hxIcA3d3vuzE7vJvmnwZ7KFKN1");
        assertThat(credentials.getTokenSecret()).isEqualTo("AsoZ8HQphwRZHwtWbDDfnNksc0mCxui6h94sfwqxgs");
    }
}
