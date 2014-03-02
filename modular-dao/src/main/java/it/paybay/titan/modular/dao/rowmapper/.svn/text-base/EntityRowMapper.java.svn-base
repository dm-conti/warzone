package it.paybay.titan.modular.dao.rowmapper;


import it.paybay.titan.modular.model.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

/**
 * {@link EntityRowMapper} class implements {@link RowMapper} interface.
 * 
 */
public class EntityRowMapper implements RowMapper<Entity> {

	@Override
	public Entity mapRow(ResultSet rs, int rowNum) throws SQLException {
		Entity entity = new Entity();
		entity.setName(rs.getString("NAME"));
		return entity;
	}

}
