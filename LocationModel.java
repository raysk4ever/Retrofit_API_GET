package volley_json.volley_json;

import java.util.ArrayList;

public class LocationModel {
        String street, city, state;
        int postcode;
        ArrayList<Coordinates> coordinatesArrayList;
        ArrayList<TimeZone> timeZoneArrayList;

    public LocationModel(String street, String city, String state, int postcode, ArrayList<Coordinates> coordinatesArrayList, ArrayList<TimeZone> timeZoneArrayList) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.postcode = postcode;
        this.coordinatesArrayList = coordinatesArrayList;
        this.timeZoneArrayList = timeZoneArrayList;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public ArrayList<Coordinates> getCoordinatesArrayList() {
        return coordinatesArrayList;
    }

    public void setCoordinatesArrayList(ArrayList<Coordinates> coordinatesArrayList) {
        this.coordinatesArrayList = coordinatesArrayList;
    }

    public ArrayList<TimeZone> getTimeZoneArrayList() {
        return timeZoneArrayList;
    }

    public void setTimeZoneArrayList(ArrayList<TimeZone> timeZoneArrayList) {
        this.timeZoneArrayList = timeZoneArrayList;
    }

    public class Coordinates{
        String latitude, longitude;

        public Coordinates(String latitude, String longitude) {
            this.latitude = latitude;
            this.longitude = longitude;
        }

        public String getLatitude() {
            return latitude;
        }

        public void setLatitude(String latitude) {
            this.latitude = latitude;
        }

        public String getLongitude() {
            return longitude;
        }

        public void setLongitude(String longitude) {
            this.longitude = longitude;
        }
    }

    public class TimeZone{
    String offset, description;

        public TimeZone(String offset, String description) {
            this.offset = offset;
            this.description = description;
        }

        public String getOffset() {
            return offset;
        }

        public void setOffset(String offset) {
            this.offset = offset;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}
