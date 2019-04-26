package volley_json.volley_json;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.POST;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Exe";
    RecyclerView rs;
    ArrayList<UserResponse> mArrayList;
    ArrayList<PlacePost> mPlacePostsList;
    MyAdapter myAdapter;
    PlacePostAdapter placePostAdapter;

    ArrayList<PlaceComments> placeCommentsArrayList;
    CommentsAdapter commentsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mArrayList = new ArrayList<>();
        mPlacePostsList = new ArrayList<>();
        placeCommentsArrayList = new ArrayList<>();

        commentsAdapter = new CommentsAdapter(placeCommentsArrayList, MainActivity.this);
        myAdapter = new MyAdapter(mArrayList);
        placePostAdapter = new PlacePostAdapter(mPlacePostsList, MainActivity.this);

        rs = findViewById(R.id.mRecyclerView);
        rs.setHasFixedSize(true);
        rs.setLayoutManager(new LinearLayoutManager(this));
        rs.setAdapter(myAdapter);
        getHeroes();
//        getPost();
//    getComments();
    }

    private void getComments() {

        Retrofit retrofit = new Retrofit.Builder().baseUrl(Api.BASE_URL).addConverterFactory(GsonConverterFactory.create())
                .build();

        Api api = retrofit.create(Api.class);

        Call<List<PlaceComments>> call = api.getComments(2);
        call.enqueue(new Callback<List<PlaceComments>>() {
            @Override
            public void onResponse(Call<List<PlaceComments>> call, Response<List<PlaceComments>> response) {
                if(!response.isSuccessful()){
                    Toast.makeText(MainActivity.this, "Response not found....", Toast.LENGTH_SHORT).show();
                    return;
                }

                List<PlaceComments> placeComments = response.body();
                for(PlaceComments placeComment : placeComments){
                    placeCommentsArrayList.add(placeComment);
                }
                commentsAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<List<PlaceComments>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Error: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void getPost() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Api api = retrofit.create(Api.class);

//        Call<List<PlacePost>> call = api.getPost(new Integer[]{2,3,6},"id","desc");

        Map<String, String> parameters = new HashMap<>();
        parameters.put("userId", "1");
        parameters.put("_sort", "id");
        parameters.put("_order", "desc");

        Call<List<PlacePost>> call = api.getPost(parameters);
        call.enqueue(new Callback<List<PlacePost>>() {
            @Override
            public void onResponse(Call<List<PlacePost>> call, Response<List<PlacePost>> response) {
                if(!response.isSuccessful())
                {
                    Toast.makeText(MainActivity.this, "Post Not Found!", Toast.LENGTH_SHORT).show();
                    return;
                }
                List<PlacePost> placePosts = response.body();
                for(PlacePost placePost : placePosts) {
                    mPlacePostsList.add(placePost);
                }
                placePostAdapter.notifyDataSetChanged();

            }

            @Override
            public void onFailure(Call<List<PlacePost>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Error: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void getHeroes() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Api api = retrofit.create(Api.class);

        Call<List<UserResponse>> call = api.getUsers();

        call.enqueue(new Callback<List<UserResponse>>() {
            @Override
            public void onResponse(Call<List<UserResponse>> call, Response<List<UserResponse>> response) {
                if(!response.isSuccessful())
                {
                    Toast.makeText(MainActivity.this, "Error code: " + response.code(), Toast.LENGTH_SHORT).show();
                    return;
                }

                List<UserResponse> usersModels = response.body();
                for (UserResponse usersModel: usersModels ){
                    mArrayList.add(usersModel);
                }
                myAdapter.notifyDataSetChanged();
                Log.d(TAG, "onResponse: " + response.body());
            }

            @Override
            public void onFailure(Call<List<UserResponse>> call, Throwable t) {
//                Toast.makeText(MainActivity.this, "Error: " + t.getMessage(), Toast.LENGTH_SHORT).show();
                Log.d(TAG, "onFailure: " + t.getMessage());
            }
        });

    }
}
