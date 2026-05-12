package org.acme.resteasyjackson;

public class Geo {
    private String lat;
    private String lng;

    public Geo() {
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public String getLng() {
        return lng;
    }

    public Geo(String lat, String lng) {
        this.lat = lat;
        this.lng = lng;
    }
}
