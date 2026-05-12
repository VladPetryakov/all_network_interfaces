import static java.lang.System.out;

public class Main {
    public static void main(String args[]) {
        Person person = new Person("Ivan", "Ivanov");
        Serializer serializer = new Serializer();
        String json = serializer.toJson(person);
        out.println(json);
        person = (Person)serializer.fromJson(json, Person.class);
        out.println(person);
    }
}
