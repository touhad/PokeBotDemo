package fr.univaix.iut.pokebattle.smartcell;

import static org.junit.Assert.assertEquals;

import java.sql.Connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.dbunit.database.DatabaseConnection;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.operation.DatabaseOperation;
import org.eclipse.persistence.internal.jpa.EntityManagerImpl;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.univaix.iut.pokebattle.DAOFactoryJPA;
import fr.univaix.iut.pokebattle.twitter.Tweet;

public class JugeAttaqueCellTest {

	JugeAttaqueCell cell = new JugeAttaqueCell();
	
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
    public void testAttaque() {
    	assertEquals("@RamolossPiot -10pv /cc @PoussinPiot @SpaceDuck_42", 
    	cell.ask(new Tweet("@RamolossPiot #attack #chocMental /cc @PoussinPiot @SpaceDuck_42 @JugePiot","PsykokwakPiot","RamolossPiot")));
    					// "([^ ]+)       #attack  #([^ ]+)    /cc ([^ ]+)      ([^ ]+)       ([^ ]+)"
    }
    @Test
    public void testNotAttaque() {
    	assertEquals(null, cell.ask(new Tweet("Maitre @JugePiot comment allez vous aujourd'hui ?","SpaceDuck_42","")));
    }
}