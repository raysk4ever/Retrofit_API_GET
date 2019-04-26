package volley_json.volley_json;

import java.util.List;

class UserModel{

    public List<Result> results;
    public Info info;

    public UserModel(List<Result> results, Info info) {
        this.results = results;
        this.info = info;
    }
    public List<Result> getResults() {
        return results;
    }
    public void setResults(List<Result> results) {
        this.results = results;
    }

    public class Info{
        public String seed;
        public int results;
        public int page;
        public String version;

        public Info(String seed, int results, int page, String version) {
            this.seed = seed;
            this.results = results;
            this.page = page;
            this.version = version;
        }

        public String getSeed() {
            return seed;
        }

        public void setSeed(String seed) {
            this.seed = seed;
        }

        public int getResults() {
            return results;
        }

        public void setResults(int results) {
            this.results = results;
        }

        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }
    }
    public Info getInfo() {
        return info;
    }
    public void setInfo(Info info) {
        this.info = info;
    }

    public class Result{
        public String gender;
        public Name name;
        public Location location;
        public String email;
        public Login login;
        public Dob dob;
        public Registered registered;
        public String phone;
        public String cell;
        public Id id;
        public Picture picture;
        public String nat;

        public Result(String gender, Name name, Location location, String email, Login login, Dob dob, Registered registered, String phone, String cell, Id id, Picture picture, String nat) {
            this.gender = gender;
            this.name = name;
            this.location = location;
            this.email = email;
            this.login = login;
            this.dob = dob;
            this.registered = registered;
            this.phone = phone;
            this.cell = cell;
            this.id = id;
            this.picture = picture;
            this.nat = nat;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public Name getName() {
            return name;
        }

        public void setName(Name name) {
            this.name = name;
        }

        public Location getLocation() {
            return location;
        }

        public void setLocation(Location location) {
            this.location = location;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public Login getLogin() {
            return login;
        }

        public void setLogin(Login login) {
            this.login = login;
        }

        public Dob getDob() {
            return dob;
        }

        public void setDob(Dob dob) {
            this.dob = dob;
        }

        public Registered getRegistered() {
            return registered;
        }

        public void setRegistered(Registered registered) {
            this.registered = registered;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getCell() {
            return cell;
        }

        public void setCell(String cell) {
            this.cell = cell;
        }

        public Id getId() {
            return id;
        }

        public void setId(Id id) {
            this.id = id;
        }

        public Picture getPicture() {
            return picture;
        }

        public void setPicture(Picture picture) {
            this.picture = picture;
        }

        public String getNat() {
            return nat;
        }

        public void setNat(String nat) {
            this.nat = nat;
        }
    }
    public class Picture{
        public String large;
        public String medium;
        public String thumbnail;

        public Picture(String large, String medium, String thumbnail) {
            this.large = large;
            this.medium = medium;
            this.thumbnail = thumbnail;
        }

        public String getLarge() {
            return large;
        }

        public void setLarge(String large) {
            this.large = large;
        }

        public String getMedium() {
            return medium;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }

        public String getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }
    }
    public class Name{
        public String title;
        public String first;
        public String last;

        public Name(String title, String first, String last) {
            this.title = title;
            this.first = first;
            this.last = last;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getFirst() {
            return first;
        }

        public void setFirst(String first) {
            this.first = first;
        }

        public String getLast() {
            return last;
        }

        public void setLast(String last) {
            this.last = last;
        }
    }
    public class Location {
        public String street;
        public String city;
        public String state;
        public Object postcode;
        public Coordinates coordinates;
        public Timezone timezone;

        public Location(String street, String city, String state, Object postcode, Coordinates coordinates, Timezone timezone) {
            this.street = street;
            this.city = city;
            this.state = state;
            this.postcode = postcode;
            this.coordinates = coordinates;
            this.timezone = timezone;
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

        public Object getPostcode() {
            return postcode;
        }

        public void setPostcode(Object postcode) {
            this.postcode = postcode;
        }

        public Coordinates getCoordinates() {
            return coordinates;
        }

        public void setCoordinates(Coordinates coordinates) {
            this.coordinates = coordinates;
        }

        public Timezone getTimezone() {
            return timezone;
        }

        public void setTimezone(Timezone timezone) {
            this.timezone = timezone;
        }
    }
    public class Coordinates{
        public String latitude;
        public String longitude;

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
    public class Timezone{
        public String offset;
        public String description;

        public Timezone(String offset, String description) {
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


