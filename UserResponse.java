package volley_json.volley_json;

import java.util.List;

public class UserResponse {

    List<UserModel> results;


    public UserResponse(List<UserModel> results) {
        this.results = results;
    }

    public List<UserModel> getResults() {
        return results;
    }

    public void setResults(List<UserModel> results) {
        this.results = results;
    }
}
