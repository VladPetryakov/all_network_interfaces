import java.util.Arrays;
import java.util.Objects;

public class Person {
    String firstName;
    String lastName;
    Address address;
    String[] phoneNumbers = new String[2];

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        address = new Address();
        phoneNumbers[0] = "12345678";
        phoneNumbers[1] = "87654321";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(address, person.address) && Arrays.equals(phoneNumbers, person.phoneNumbers);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(firstName, lastName, address);
        result = 31 * result + Arrays.hashCode(phoneNumbers);
        return result;
    }
}
