package org.acme.resteasyjackson;

import io.smallrye.reactive.messaging.kafka.Record;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class PersonProducer {

    @Inject
    @Channel("persons-out")
    Emitter<Record<Integer, String>> emitter;

    public void sendPersonToKafka(Person person) {
        emitter.send(Record.of(person.getId(), person.getName()));
    }
}