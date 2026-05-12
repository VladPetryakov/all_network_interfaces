package org.acme.rest.json;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.Set;
import java.util.concurrent.CompletionStage;

@Path("/")
@RegisterRestClient(configKey = "users-api")
public interface PersonsService {

    @GET
    @Path("/users")
    Set<Person> getAll();
}
