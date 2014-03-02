package it.paybay.titan.rest.service.integration;

import it.paybay.titan.rest.model.Entity;
import it.paybay.titan.rest.service.GenericService;
import it.paybay.titan.rest.service.exception.CannotAccessRepositoryException;

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
 *  This class contains the test suite with the integration tests
 *  between the Service layer and the DAO layer.
 *  
 *  @author Salvatore Esposito [salvatore.esposito@quigroup.it]
 *  
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:META-INF/spring/spring-service-context.xml","classpath*:service-conf-it.xml" })
public class GenericServiceIT {
	
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private GenericService genericService;
	
	@Autowired
	private IDatabaseTester databaseTester;
	
	@Autowired
	private IDataSet dataset; // initialize your dataset here
	
	/**
	 * Setup the test environment. 
	 * @throws Exception 
	 */
	@Before
	public void setUp() throws Exception{
		//add setup configuration
		
		databaseTester.setDataSet(dataset);

		// will call default setUpOperation
		databaseTester.onSetup();
	}
	
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
     * @throws CannotAccessRepositoryException 
	 */
	@Test
	public void getOnEntities_WithValidName_EntityFound() throws CannotAccessRepositoryException{
		LOG.info("Integration Test Suite Service - Test Case Get an entity - 01");
		
		//create the current object
		Entity current = new Entity();
		String name = "aName";
		current.setName(name);
		
		//invoke the method under test
		Entity expected = genericService.getEntity(name);
		
		//check the expected result with Asserts provided by JUnit framework
		Assert.assertEquals("The name must be '" + name + "'", current.getName(), expected.getName());
		
	}

}
