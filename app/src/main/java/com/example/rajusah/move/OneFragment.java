package com.example.rajusah.move;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class OneFragment extends Fragment {
    private static final String TAG=OneFragment.class.getSimpleName();
    public static final String BASE_URL= "http://api.themoviedb.org/3/";
    private RecyclerView recyclerView;
    private Retrofit retrofit;
    private final static String API_KEY="a4eec5bc0c325e38b7c2a297a6f3f5e4";



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
View v =inflater.inflate(R.layout.fragment_one, container, false);
recyclerView = (RecyclerView)v.findViewById(R.id.recycler_view);
        return v;

}

public void onViewCreated(View view,Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        connectAndGetApiData();
}

    private void connectAndGetApiData() {
        if (retrofit == null) {
                        retrofit = new Retrofit.Builder()
                                        .baseUrl(BASE_URL)
                                        .addConverterFactory(GsonConverterFactory.create())
                                        .build();
                    }
                MovieApi movieApiService = retrofit.create(MovieApi.class);
                Call<MovieResponse> call = movieApiService.getTopRatedMovies(API_KEY);
                call.enqueue(new Callback<MovieResponse>() {
             @Override
             public void onResponse(Call<MovieResponse> call, Response<MovieResponse> response) {
                                List<Movie> movies = response.body().getResults();
                                recyclerView.setAdapter(new MovieAdapter(movies, R.layout.list_item_movie, getContext()));
                                recyclerView.setLayoutManager(new GridLayoutManager(getContext(),2));
                               Log.d(TAG, "Number of movies received: " + movies.size());
                            }

                     @Override
             public void onFailure(Call<MovieResponse> call, Throwable throwable) {
                                Log.e(TAG, throwable.toString());
                            }
         });

    }

}
