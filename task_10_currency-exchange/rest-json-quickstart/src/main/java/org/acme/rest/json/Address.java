package org.acme.rest.json;

import java.util.Objects;

public class Address {
    private String suite;
    private String city;
    private String zipcode;
    private String street;
    private Geo geo;

    public Address(String suite, String city, String zipcode, String street, Geo geo) {
        this.suite = suite;
        this.city = city;
        this.zipcode = zipcode;
        this.street = street;
        this.geo = geo;
    }

    public Address() {
    }

    public String getSuite() {
        return suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return  Objects.equals(suite, address.suite) &&
                Objects.equals(city, address.city) &&
                Objects.equals(zipcode, address.zipcode) &&
                Objects.equals(street, address.street) &&
                Objects.equals(geo, address.geo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suite, city, zipcode, street, geo);
    }
}
