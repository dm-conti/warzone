package it.paybay.titan.modular.dao;

import it.paybay.titan.modular.dao.exception.ResourceAccessException;
import it.paybay.titan.modular.model.Entity;

/**
 *  DAO - Contains the interface of the DAO Layer.
 *  
 *  @author Raffaele Carotenuto [raffaele.carotenuto@quigroup.it]
 *  
 */
public interface GenericDao {
	
	/**
	 * Simple example of DAO method.
	 * 
	 * @param name
	 * @return a bean Entity
	 * @throws ResourceAccessException 
	 */
	public Entity getEntity(String name) throws ResourceAccessException;
}

