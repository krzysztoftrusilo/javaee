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

import com.example.ktrusilo.zad07.domain.Producer;
import com.example.ktrusilo.zad07.service.ProducerManager;

@Path("producer")
@Stateless
public class ProducerRESTService {

	@Inject
	private ProducerManager pm;	
	
	@GET
	@Path("/{producerId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Producer getProducer(@PathParam("producerId") int id) {
		return pm.getProducer(id);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Producer> getProducer() {
		return pm.getAllProducer();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addProducer(Producer producer) {
		pm.addProducer(producer);
		return Response.status(Response.Status.CREATED).entity("Producer").build();
	}

	@PUT
	@Path("/{producerId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Producer updateProducer(@PathParam("producerId") int id, Producer producer) {
		return pm.updateProducer(producer, id);
	}

	@DELETE
	public Response clearProducers() {
		pm.deleteAllProducer();
		return Response.status(Response.Status.OK).build();
	}

	@DELETE
	@Path("/{producerId}")
	public Response deleteProducer(@PathParam("producerId") int id) {
		pm.deleteProducer(id);
		return Response.status(200).build();
	}
}
