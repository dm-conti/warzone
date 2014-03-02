package it.paybay.titan.modular.dao;

import it.paybay.titan.modular.dao.exception.ResourceAccessException;
import it.paybay.titan.modular.dao.rowmapper.EntityRowMapper;
import it.paybay.titan.modular.model.Entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.stereotype.Repository;

/**
 *  DAO - Contains the implementation of the GenericDAO interface.
 *  
 *  @author Raffaele Carotenuto [raffaele.carotenuto@quigroup.it]
 *  
 */
@Repository
public class GenericDaoImpl extends NamedParameterJdbcDaoSupport implements GenericDao {

	private static final Logger logger = LoggerFactory.getLogger(GenericDaoImpl.class);
	
	/** simple sql query */ 
	private static final String QUERY ="SELECT * FROM ENTITY WHERE NAME = :name";
	
	@Override
	public Entity getEntity(String name) throws ResourceAccessException {
		logger.info("Core Component - Dao Layer");
		MapSqlParameterSource paramMap = new MapSqlParameterSource();
		paramMap.addValue("name", name);
		return getNamedParameterJdbcTemplate().queryForObject(QUERY, paramMap, new EntityRowMapper());
	}

}
