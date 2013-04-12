package fr.univaix.iut.pokebattle.bot;

import java.sql.Connection;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.dbunit.database.DatabaseConnection;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.eclipse.persistence.internal.jpa.EntityManagerImpl;
import org.junit.BeforeClass;

import fr.univaix.iut.pokebattle.DAOFactoryJPA;
import fr.univaix.iut.pokebattle.smartcell.*;
import fr.univaix.iut.pokebattle.twitter.Tweet;


public class PokeBot implements Bot {
    /**
     * List of smartcell the questions go through to
     * find an answer.
     */
	PokemonCriesGeneCell cell = new PokemonCriesGeneCell();
	
	private static EntityManager entityManager;
    private static FlatXmlDataSet dataset;
    private static DatabaseConnection dbUnitConnection;
    private static EntityManagerFactory entityManagerFactory;
	
	@BeforeClass
	public static void initTestFixture() throws Exception {
	    // Get the entity manager for the tests.
	    entityManagerFactory = Persistence.createEntityManagerFactory("pokebattlePUTest");
	    entityManager = entityManagerFactory.createEntityManager();

	    DAOFactoryJPA.setEntityManager(entityManager);
	    Connection connection = ((EntityManagerImpl) (entityManager.getDelegate())).getServerSession().getAccessor().getConnection();

	    dbUnitConnection = new DatabaseConnection(connection);
	    //Loads the data set from a file
	    dataset = new FlatXmlDataSetBuilder().build(Thread.currentThread()
	            .getContextClassLoader()
	            .getResourceAsStream("pokemonDataset.xml"));
	}
	
    final SmartCell[] smartCells = new SmartCell[]{

    		new PokemonCriesGeneCell(),
    		new PokemonCriesCell(),
            new PokemonOwnerCell(),
            new PokemonIndiqueEleveur(),
            new PokemonCaptureCell(),
            new PokemonAttackCell(),
            new PokemonCriesCell()
    };

    Date DateTweet = new Date ();
    @Override
    public String ask(Tweet question) 
    {
        for (SmartCell cell : smartCells)
        {
            String answer = cell.ask(question);
            if (answer != null)
            	return answer + "       // à : " 
							+ DateTweet.getHours() + ":" 
							+ DateTweet.getMinutes() + ":"
							+ DateTweet.getSeconds();
             
        }
        return null;
    }

}
