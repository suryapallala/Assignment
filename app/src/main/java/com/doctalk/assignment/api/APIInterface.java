package com.doctalk.assignment.api;

import com.doctalk.assignment.model.GitUsersList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by surya on 27/1/18.
 */

public interface APIInterface {


        @GET("search/users")
    Call<GitUsersList> getGitUsers(@Query(value = "q", encoded = true) String q);

}
