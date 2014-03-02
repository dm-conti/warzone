package it.paybay.titan.rest.service.unit;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;
import org.junit.Assert;
import it.paybay.titan.rest.dao.GenericDao;
import it.paybay.titan.rest.dao.exception.ResourceAccessException;
import it.paybay.titan.rest.model.Entity;
import it.paybay.titan.rest.service.GenericService;
import it.paybay.titan.rest.service.GenericServiceImpl;
import it.paybay.titan.rest.service.exception.CannotAccessRepositoryException;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 *  Write the test suite for unit testing the GenericService implementation.
 *  
 *  @author Salvatore Esposito [salvatore.esposito@quigroup.it]
 *  
 */
public class GenericServiceTest {
	
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	/** The Generic service representing the class under test */
	private GenericService classUnderTest;
	
	/** The generic DAO that needs to be mocked in order to unit test this service */
	private GenericDao mock;
	
	/**
     * Set up the mocked environment in order to run the unit test.
     */
	@Before
    public void setUp() {
    	//use the mocking framework to create the mock
		mock = createMock(GenericDao.class);
		//create the instance for testing using the mock
        classUnderTest = new GenericServiceImpl(mock);
    }
	
	/**
	 * Test Suite Controller - Test Case Find an entity - 01
	 * Find an entity
	 * Input: Valid Entity name
	 * Expected Output: Returned the expected entity
	 * @throws ResourceAccessException 
	 * @throws CannotAccessRepositoryException 
	 */
	@Test
	public void getEntityByName_WithValidName_EntityFound() throws ResourceAccessException, CannotAccessRepositoryException{
		LOG.info("Unit Test Suite Service - Test Case Get an entity - 01");
		
		//create the entity expected
		Entity expected = new Entity();
		String name = "aName";
		expected.setName(name);
		
		//add the behavior to mock
		expect(mock.getEntity(name)).andReturn(expected);
		
		//update the mock after expect method
		replay(mock);
		
		//invoke the method under testing
		Entity result = classUnderTest.getEntity(name);
		
		//compare the expected with result with Asserts provided to JUnit framework
		Assert.assertEquals("The name must be '" + name + "'", expected.getName(), result.getName());
		
		//verify all the methods in the mock are called as expected (and previously configured)
		verify(mock);
	}

}
