package com.doctalk.assignment.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by surya on 27/1/18.
 */

public class items {

    @SerializedName("login")
    String name;

    public String getName() {
        return name;
    }
}
