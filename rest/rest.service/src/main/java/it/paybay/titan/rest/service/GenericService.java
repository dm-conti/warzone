package it.paybay.titan.rest.service;

import it.paybay.titan.rest.model.Entity;
import it.paybay.titan.rest.service.exception.CannotAccessRepositoryException;
import it.paybay.titan.rest.springdata.entities.Post;

/**
 *  This class contains the interface of the Service Layer.
 *  
 *  @author Raffaele Carotenuto [raffaele.carotenuto@quigroup.it]
 *  
 */
public interface GenericService {

	/*
	 * Simple example of service method
	 * 
	 * @param name
	 * @return a bean Entry
	 * @throws CannotAccessRepositoryException 
	 */
	public Entity getEntity(String name) throws CannotAccessRepositoryException;
	
	public Post getEntityFromRepository(String name) throws CannotAccessRepositoryException;
}
