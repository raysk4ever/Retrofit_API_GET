package volley_json.volley_json;

import org.json.JSONObject;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface Api {

//    String BASE_URL = "raw.githubusercontent.com/iranjith4/radius-intern-mobile/master/";
String BASE_URL = "https://raw.githubusercontent.com/iranjith4/radius-intern-mobile/master/";
//String BASE_URL = "https://jsonplaceholder.typicode.com/";

    @GET("users.json/")
    Call<List<UserResponse>> getUsers();

    @GET("posts")
    Call<List<PlacePost>> getPost(@Query("userId") Integer[] userId,
                                  @Query("_sort") String sort,
                                  @Query("_order") String order
    );

    @GET("posts")
    Call<List<PlacePost>> getPost(@QueryMap Map<String, String> parameters);

    @GET("posts/{id}/comments")
    Call<List<PlaceComments>> getComments(@Path("id") int postId);
}
