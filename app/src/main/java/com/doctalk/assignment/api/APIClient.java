package com.doctalk.assignment.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by surya on 27/1/18.
 */

public class APIClient {
    private static final APIClient ourInstance = new APIClient();

    public static Retrofit client = null;

    public static APIClient getInstance() {
        return ourInstance;
    }

    private APIClient() {
    }

    public Retrofit getClient() {
        if(client == null) {
            client = new Retrofit.Builder()
                     .baseUrl(Urls.BASE_URL)
                     .addConverterFactory(GsonConverterFactory.create())
                     .build();
        }

        return client;
    }

}
