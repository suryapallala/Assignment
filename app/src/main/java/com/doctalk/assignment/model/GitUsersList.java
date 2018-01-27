package com.doctalk.assignment.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by surya on 27/1/18.
 */

public class GitUsersList {

    @SerializedName("items")
    List<items> itemsList;

    public List<items> getItemsList() {
        return itemsList;
    }
}
