package fr.univaix.iut.pokebattle.smartcell;

import static org.junit.Assert.assertEquals;

import java.sql.Connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.dbunit.DatabaseUnitException;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.operation.DatabaseOperation;
import org.eclipse.persistence.internal.jpa.EntityManagerImpl;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.univaix.iut.pokebattle.DAOFactoryJPA;
import fr.univaix.iut.pokebattle.twitter.Tweet;

public class PokemonOwnerCellTest {
	
	PokemonOwnerCell cell = new PokemonOwnerCell();
	
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
	
	@Before
	public void setUp() throws Exception {
	    //Clean the data from previous test and insert new data test.
	    DatabaseOperation.CLEAN_INSERT.execute(dbUnitConnection, dataset);
    
	}
	
	
	@Test
	public void testAvecEleveur() throws DatabaseUnitException {
		assertEquals("@PoussinPiot @PoussinPiot is my owner",
				cell.ask(new Tweet("@RamolossPiot owner?", "PoussinPiot", "RamolossPiot"))); 
	}
	@Test
	public void testSansEleveur() throws DatabaseUnitException {
		assertEquals("@PoussinPiot no owner",
				cell.ask(new Tweet("@MagicarpePiot owner?","PoussinPiot","MagicarpePiot"))); 
	}
	@Test
	public void testPsykokwak() throws DatabaseUnitException {
		assertEquals("@PoussinPiot @SpaceDuck_42 is my owner",
				cell.ask(new Tweet("@PsykokwakPiot owner?","PoussinPiot","PsykokwakPiot"))); 
	}
	

}
