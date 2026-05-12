import java.util.Objects;

public class Address {
    String streetAddress;
    String city;
    String postalCode;

    public Address(){
        streetAddress = "street 1";
        city = "City 1";
        postalCode = "12345678";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(streetAddress, address.streetAddress) && Objects.equals(city, address.city) && Objects.equals(postalCode, address.postalCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(streetAddress, city, postalCode);
    }
}
