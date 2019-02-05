package com.example.ktrusilo.zad07.rest;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.example.ktrusilo.zad07.domain.Wardrobe;
import com.example.ktrusilo.zad07.service.WardrobeManager;


@Path("wardrobe")
@Stateless
public class WardrobeRESTService {
	
	@Inject
	private WardrobeManager wm;
	
	@GET
	@Path("/{wardrobeId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Wardrobe getWardrobe(@PathParam("wardrobeId") int id) {
		return wm.getWardrobe(id);
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Wardrobe> getWardrobe() {
		return wm.getAllWardrobes();
	}
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addWardrobe(Wardrobe wardrobe) {
		wm.addWardrobe(wardrobe);
		return Response.status(Response.Status.CREATED).entity("wardrobe").build();
	}
	
	@PUT
	@Path("/{wardrobeId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Wardrobe updateWardrobe(@PathParam("wardrobeId") int id, Wardrobe wardrobe) {
		return wm.updateWardrobe(wardrobe, id);
	}
	
	
	@DELETE
	public Response clearWardrobes() {
		wm.deleteAllWardrobes();
		return Response.status(Response.Status.OK).build();
	}

	@DELETE
	@Path("/{wardrobeId}")
	public Response deleteWardrobe(@PathParam("wardrobeId") int id) {
		wm.deleteWardrobe(id);
		return Response.status(200).build();
	}

}
