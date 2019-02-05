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

import com.example.ktrusilo.zad07.domain.Number;
import com.example.ktrusilo.zad07.service.NumberManager;

@Path("number")
@Stateless
public class NumberRESTService {
	
	@Inject
	private NumberManager nm;

	@GET
	@Path("/{numberId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Number getNumber(@PathParam("numberId") int id) {
		return nm.getNumber(id);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Number> getNumber() {
		return nm.getAllNumber();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addNumber(Number number) {
		nm.addNumber(number);
		return Response.status(Response.Status.CREATED).entity("number").build();
	}

	@PUT
	@Path("/{numberId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Number updateNumber(@PathParam("numberId") int id, Number number) {
		return nm.updateNumber(number, id);
	}

	@DELETE
	public Response clearNumber() {
		nm.deleteAllNumber();
		return Response.status(Response.Status.OK).build();
	}

	@DELETE
	@Path("/{numberId}")
	public Response deleteNumber(@PathParam("numberId") int id) {
		nm.deleteNumber(id);;
		return Response.status(200).build();
	}

}
