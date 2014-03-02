package it.paybay.titan.rest.dao.integration;

import it.paybay.titan.rest.dao.GenericDao;
import it.paybay.titan.rest.dao.exception.ResourceAccessException;
import it.paybay.titan.rest.model.Entity;

import org.dbunit.IDatabaseTester;
import org.dbunit.dataset.IDataSet;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *  Test suite of integration tests between 
 *  the DAO layer and the database (Oracle, MySQL, etc..)
 *  
 *  @author Salvatore Esposito [salvatore.esposito@quigroup.it]
 *  
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:META-INF/spring/spring-dao-context.xml","classpath:dao-conf-it.xml" })
public class GenericDAOIT {
	
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private GenericDao genericDao;
	
	@Autowired
	private IDataSet dataset; // initialize your dataset here
	
	@Autowired
	private IDatabaseTester databaseTester;
	
	/**
     * Set up the test context. 
     * 
	 * @throws Exception 
     * **/
	@Before
	public void setUp() throws Exception{
		// Set up the test environment.
		
		databaseTester.setDataSet(dataset);
        // will call default setUpOperation
        databaseTester.onSetup();
	}
	
	/**
     * Release resources
     * 
	 * @throws Exception 
     * **/
	@After
    public void tearDown() throws Exception
    {
		//set free the resources after execution.
		
		// will call default tearDownOperation
        databaseTester.onTearDown();
    }
	
    /**
	 * Integration Test Suite Controller - Test Find an Entity - 01
	 * Find an entity.
	 * Input: Valid Name
	 * Expected Output: entity found
	 * 
     * @throws ResourceAccessException 
	 */
	@Test
	public void getOnEntities_WithValidName_EntityFound() throws ResourceAccessException {
		LOG.info("Integration Test Suite Dao - Test Case Get an entity - 01");
		
		//create the current object
		String name = "aName";
		Entity current = new Entity();
		current.setName(name);
		
		//invoke the method under test
		Entity expected = genericDao.getEntity(name);
		
		//Verify the expected result with the Asserts provided by JUnit framework
		Assert.assertEquals("The name must be '" + name + "'", current.getName(), expected.getName());
	}
	

}
