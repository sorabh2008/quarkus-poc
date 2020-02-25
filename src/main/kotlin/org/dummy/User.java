package org.dummy;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("/user")
public class User {

	@GET
	@javax.ws.rs.Produces(MediaType.TEXT_PLAIN)
	public String hello() {
	    return "Hello user";
	}
	
}
