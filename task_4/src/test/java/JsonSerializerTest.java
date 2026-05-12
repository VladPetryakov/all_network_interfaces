import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JsonSerializerTest {
    Serializer serializer = new Serializer();
    Person person = new Person("ivan", "petrov");

    @Test
    void serialize() {
        String expected_json = "{\"firstName\":\"ivan\"," +
                                "\"lastName\":\"petrov\"," +
                                "\"address\":{\"streetAddress\":\"street 1\",\"city\":\"City 1\",\"postalCode\":\"12345678\"}," +
                                "\"phoneNumbers\":[\"12345678\",\"87654321\"]}";
        assertEquals(expected_json, serializer.toJson(person));
    }

    @Test
    void deserialize() {
        String json = "{\"firstName\":\"ivan\"," +
                "\"lastName\":\"petrov\"," +
                "\"address\":{\"streetAddress\":\"street 1\",\"city\":\"City 1\",\"postalCode\":\"12345678\"}," +
                "\"phoneNumbers\":[\"12345678\",\"87654321\"]}";
        assertEquals(person, serializer.fromJson(json, Person.class));
    }
}
