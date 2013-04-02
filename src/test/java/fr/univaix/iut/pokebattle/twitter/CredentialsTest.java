package fr.univaix.iut.pokebattle.twitter;

import static org.fest.assertions.Assertions.assertThat;

import java.io.InputStream;

import org.junit.Test;

import fr.univaix.iut.pokebattle.tuse.Credentials;

public class CredentialsTest {
    @Test
    public void testLoadCredentialsGivenAValidPropertiesFileShouldReturnAValidCredentials() throws Exception {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("./twitter4j.properties");
        Credentials credentials = Credentials.loadCredentials(inputStream);
        assertThat(credentials.getConsumerKey()).isEqualTo("g8RSWM8U7hCNTLDDY46MoQ");
        assertThat(credentials.getConsumerSecret()).isEqualTo("TYZ98eE4emq9RGegBlZ4pMtbKUejQ8HrUcp0WLq30");
        assertThat(credentials.getToken()).isEqualTo("1282859694-F04iSfjY5G0o3PCktAj8CmdRBylBKM7Jq49Gftv");
        assertThat(credentials.getTokenSecret()).isEqualTo("qPTDRLk3tjSnaP8UHO4IRm5TCIlPHnw9RazCrh8oM");
    }
}
