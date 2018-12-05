package com.example.restwsdemo.rest;

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

import com.example.restwsdemo.domain.Wardrobe;
import com.example.restwsdemo.service.WardrobeManager;

@Path("wardrobe")
@Stateless
public class WardrobeRESTService {

	@Inject
	private WardrobeManager wm;

	@GET
	@Path("/{wardrobeId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Wardrobe getPerson(@PathParam("wardrobeId") Integer id) {
		Wardrobe w = wm.getWardrobe(id);
		return w;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Wardrobe> getWardrobes() {
		return wm.getAllWardrobes();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addWardrobe(Wardrobe wardrobe) {
		wm.addWardrobe(wardrobe);

		return Response.status(201).entity("Wardrobe").build();
	}

	@GET
	@Path("/test")
	@Produces(MediaType.TEXT_PLAIN)
	public String test() {
		return "REST API /Narnia wardrobe is on!";
	}

	@DELETE
	public Response clearWardrobes() {
		wm.deleteAllWardrobes();
		return Response.status(200).build();
	}

}
