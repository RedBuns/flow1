package com.cosmos.processors;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import com.cosmos.domain.*;

// This could be an interface if CAMEL-6014 is fixed.

@Path("/personservice/")
public class PersonService {
    
    @GET
    @Path("/person/get/{id}/")
    @Produces("application/xml")
    public Person getPerson(@PathParam("id") String id) {
        return null;
    }

    @POST
    @Path("/person/post")
    public Response putPerson(Person person) {
        return null;
    }

    @DELETE
    @Path("/person/delete/{id}")
    public void deletePerson(@PathParam("id") String id) {
    }
}