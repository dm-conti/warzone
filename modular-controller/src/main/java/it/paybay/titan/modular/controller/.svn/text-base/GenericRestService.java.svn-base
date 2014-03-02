package it.paybay.titan.modular.controller;

import it.paybay.titan.modular.service.exception.CannotAccessRepositoryException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("findEntity")
@Produces("application/json")
public interface GenericRestService {

    @GET
    @Path("name/{name}")
    @Produces("application/json")
    public String getEntityByName(@PathParam("name") String name) throws CannotAccessRepositoryException;

}
