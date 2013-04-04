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
        assertThat(credentials.getConsumerKey()).isEqualTo("D7eTfZKlqHaFdStsD1Q");
        assertThat(credentials.getConsumerSecret()).isEqualTo("56FD5cYzd27HmRultIyqyRqkcK7GC7tPBZbeZP8Co");
        assertThat(credentials.getToken()).isEqualTo("1283377596-u8wnGjs5GuG05ZfOYsjuBVfJ8RkmXbUkSOXh5JV");
        assertThat(credentials.getTokenSecret()).isEqualTo("1FBpavseCCNEJfCuWD4GDGteqmvEwDsd6DjBB8QZI");
    }
}
