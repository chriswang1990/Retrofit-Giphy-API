package com.example.chriswang.retrofitgiphyapi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GiphyAPI {
    String ENDPOINT = "http://api.giphy.com";
    @GET("v1/gifs/search")
    Call<GiphyResponse> getResponse(@Query("q") String searchTerm, @Query("api_key") String apiKey, @Query("limit") int limit);
}
