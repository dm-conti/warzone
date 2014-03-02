package it.paybay.titan.rest.service;

import it.paybay.titan.rest.dao.GenericDao;
import it.paybay.titan.rest.dao.exception.ResourceAccessException;
import it.paybay.titan.rest.model.Entity;
import it.paybay.titan.rest.service.exception.CannotAccessRepositoryException;
import it.paybay.titan.rest.springdata.entities.Post;
import it.paybay.titan.rest.springdata.repositories.PostRepository;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *  This class contains the implementation of the Service Layer methods.
 *  It uses the features offered by the DAO Layer in order to implement the application logic.
 *  
 *  @author Raffaele Carotenuto [raffaele.carotenuto@quigroup.it]
 *  
 */
@Service
public class GenericServiceImpl implements GenericService{

	private static final Logger logger = LoggerFactory.getLogger(GenericServiceImpl.class);
	
	/* Invoke the methods of the DAO layer for retrieving business data */
	private GenericDao genericDao;
	
	@Autowired
	private PostRepository repository;

	@Autowired
	public GenericServiceImpl(GenericDao genericDao){
		this.genericDao = genericDao;
	}
	
	@Override
	public Entity getEntity(String name) throws CannotAccessRepositoryException {
		logger.info("Core Component - Service Layer");
		try {
			return genericDao.getEntity(name);
		} catch (ResourceAccessException e) {
			throw new CannotAccessRepositoryException(e.getMessage(), e.getCause());
		}
	}
	
	@Override
	public Post getEntityFromRepository(String name) throws CannotAccessRepositoryException {
		logger.info("Core Component - Service Layer");
		
		Post post = new Post();
		post.setPostDate(new Date());
		post.setTitle("First Post");
		
		repository.save(post);
		
		return repository.findOne(post.getPostId()); 
	}
}