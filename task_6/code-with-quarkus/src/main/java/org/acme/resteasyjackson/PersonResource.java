package org.acme.resteasyjackson;

import org.jboss.resteasy.annotations.jaxrs.PathParam;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;
import javax.inject.Inject;
import javax.ws.rs.core.Response;

@Path("/")
public class PersonResource {

    @Inject
    PersonProducer producer;

    @POST
    public Response sendToKafka(Person person){
        producer.sendPersonToKafka(person);
        return Response.accepted().build();
    }

}