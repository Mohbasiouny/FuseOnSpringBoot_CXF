package org.mycompany;

import java.io.IOException;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class Service {

	@POST  
	@Produces(MediaType.APPLICATION_JSON)

	
	public Response doPost(String data) throws IOException {
    return Response.ok().build();
	}
}
	