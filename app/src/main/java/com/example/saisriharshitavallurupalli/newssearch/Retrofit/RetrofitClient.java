package com.example.saisriharshitavallurupalli.newssearch.Retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static SearchApi searchApi;
    private static Retrofit getClient(String baseUrl) {
        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    public static SearchApi getCcApi() {
        if (searchApi == null) {
            searchApi = getClient("http://webhose.io/").create(SearchApi.class);
        }
        return searchApi;
    }

}
