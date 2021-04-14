package org.acme.resteasyjackson;

import io.smallrye.reactive.messaging.kafka.Record;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PersonConsumer {

    private final Logger logger = Logger.getLogger(String.valueOf(PersonConsumer.class));

    @Incoming("persons-in")
    public void receive(Record<Integer, String> person) {
        logger.infof("Got a person: %d - %s", person.key(), person.value());
    }
}
