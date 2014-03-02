package it.paybay.titan.modular.controller;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;

import it.paybay.titan.modular.model.Entity;
import it.paybay.titan.modular.service.GenericService;
import it.paybay.titan.modular.service.exception.CannotAccessRepositoryException;


public class GenericRestServiceImpl implements GenericRestService{


    //Just like Spring.  Please add Getters/Setters. Blueprint annotations are still work in progress
    private GenericService genericService;

    /*
        Constructor
     */

    public GenericRestServiceImpl(){
    }

    /*
        Getters and Setters
     */

    public GenericService getGenericService() {
        return genericService;
    }

    public void setGenericService(GenericService genericService) {
        this.genericService = genericService;
    }


	@Override
	public String getEntityByName(String name) throws CannotAccessRepositoryException {
		return genericService.getEntity(name).getName();
	}

}
