package com.example.rajusah.move;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface MovieApi {
    @GET("movie/top_rated")
    Call<MovieResponse> getTopRatedMovies(@Query("api_key") String apiKey);

    @GET("movie/now_playing?api_key=41ba94a808e254869fc116a61a02f803&page=1")
    Call<MovieResponse> getNowPlayingMovies(@Query("api_key") String apiKey);
}
