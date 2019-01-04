package ug.ktrusilo.javaee.REST.rest;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ug.ktrusilo.javaee.REST.domain.Wardrobe;
import ug.ktrusilo.javaee.REST.service.WardrobeManager;

@Path("wardrobe")
@Stateless
public class WardrobeRESTService {

	@Inject
	WardrobeManager pm;
	
	@GET
	@Path("/{wardrobeId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Wardrobe getWardrobe(@PathParam("wardrobeId") long id)
	{
		return pm.getById(id);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Wardrobe> getAll()
	{
		return pm.getAll();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addWardrobe(Wardrobe wardrobe)
	{
		pm.addWardrobe(wardrobe);
		return Response.status(201).entity("Wardrobe").build();
	}
	
	
	@DELETE
	@Path("/{wardrobeId}")
	public Response deleteById(@PathParam("wardrobeId") long id)
	{
		Wardrobe c = pm.getById(id);
		if(c==null) return Response.status(404).build();
		pm.deleteWardrobe(c);
		return Response.status(200).build();
	}
}
