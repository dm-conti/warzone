package it.paybay.titan.rest.dao.unit;

import java.io.File;

import it.paybay.titan.rest.dao.GenericDao;
import it.paybay.titan.rest.dao.exception.ResourceAccessException;
import it.paybay.titan.rest.model.Entity;

import org.dbunit.IDatabaseTester;
import org.dbunit.JdbcDatabaseTester;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSet;
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
 *  ***************************************************************************************************************
 *  - DESCRIPTION -
 *  
 *  Write your test suite for unit testing about the GenericDAO implementation.
 * 
 *  ***************************************************************************************************************
 *  
 *  @author Salvatore Esposito [salvatore.esposito@quigroup.it]
 *  
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:dao-conf-ut.xml")
public class GenericDAOTest {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	/**
	 * the class/interface under testing
	 */
	@Autowired
	private GenericDao classUnderTest;

	private IDatabaseTester databaseTester;

	@Before
	public void setUp() throws Exception {
		// add set up environment needed.

		databaseTester = new JdbcDatabaseTester("org.hsqldb.jdbcDriver",
				"jdbc:hsqldb:file:target/db/entity_hsqldb", "sa", "");

		// initialize your dataset here
		IDataSet dataSet = getDataSet();

		databaseTester.setDataSet(dataSet);
		// will call default setUpOperation
		databaseTester.onSetup();
	}

	@After
	public void tearDown() throws Exception {
		// set free the resources after execution.
		
		// will call default tearDownOperation
        databaseTester.onTearDown();
	}

	/**
	 * Test Suite Controller - Test Case Find an entity - 01 Find an entity
	 * Input: Valid Entity name Expected Output: Returned the expected entity
	 * @throws ResourceAccessException 
	 */
	@Test
	public void getEntityByName_WithValidName_EntityFound() throws ResourceAccessException {
		LOG.info("Unit Test Suite Dao - Test Case Get an entity - 01");

		// this is the entity that will be returned from dao
		String name = "aName";
		Entity current = new Entity();
		current.setName(name);

		// invoke the method under test
		Entity expected = classUnderTest.getEntity(name);

		// compare the expected with result with Asserts provided to JUnit
		// framework
		Assert.assertEquals("The name must be '" + name + "'",
				current.getName(), expected.getName());
	}

	/**
	 * loading data in db
	 * 
	 * @return
	 * @throws Exception
	 */
	private IDataSet getDataSet() throws Exception {
		// get insert data
		File file = new File("src/test/resources/db/dataset.xml");
		return new FlatXmlDataSet(file);
	}

}
