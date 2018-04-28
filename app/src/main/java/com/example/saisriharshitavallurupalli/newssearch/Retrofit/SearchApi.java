package com.example.saisriharshitavallurupalli.newssearch.Retrofit;

import com.example.saisriharshitavallurupalli.newssearch.models.News;


import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface SearchApi {

    @GET("filterWebContent")
    Call<News> baseApiCall(@QueryMap Map<String, String> parameter);


}
