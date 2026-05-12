package org.acme.rest.json;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;
import javax.inject.Inject;

@Path("/persons")
public class PersonResource {

    @Inject
    @RestClient
    PersonsService personService;

    @GET
    @Path("/name/{name}")
    public Set<Person> name(@PathParam String name) {
        return null;
    }

    private Set<Person> persons = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

    public PersonResource() {
        Geo geo = new Geo("1", "1");
        Address address = new Address("sg", "rg", "1234", "str", geo);
        Company company = new Company("name", "ph", "123");
        String number = "12345678";
        persons.add(new Person("1", "Ivan", "IvAn", "email", address, number, "site", company));
        persons.add(new Person("1", "Ivan", "IvAn", "email", address, number, "site", company));
    }

    @GET
    public Set<Person> list() {
        return personService.getAll();
    }

    @POST
    public Set<Person> add(Person person) {
        persons.add(person);
        return persons;
    }

    @DELETE
    public Set<Person> delete(Person person) {
        persons.removeIf(existingPerson -> existingPerson.getName().contentEquals(person.getName()));
        return persons;
    }
}