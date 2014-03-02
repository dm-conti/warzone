package it.paybay.titan.rest.model;

import java.util.Date;

import org.springframework.hateoas.ResourceSupport;

/**
 *  Resource used for the communication with the client in order to
 *  build the reply message payload. It is different from the business model.
 *  
 *  @author Salvatore Esposito [salvatore.esposito@quigroup.it]
 *  
 */
public class EntityResource extends ResourceSupport {
	
	/** A simple bean entity */
	private Entity entity;
	
	/** Response date */
	private Date responseDate;
		
	public EntityResource(Entity entity) {
		this.setEntity(entity);
	}

	public void setEntity(Entity entity) {
		this.entity = entity;
	}

	public Entity getEntity() {
		return entity;
	}

	public Date getResponseDate() {
		return responseDate;
	}

	public void setResponseDate(Date responseDate) {
		this.responseDate = responseDate;
	}
	
}


