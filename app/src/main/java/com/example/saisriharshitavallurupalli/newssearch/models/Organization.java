package com.example.saisriharshitavallurupalli.newssearch.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Organization {

    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("sentiment")
    @Expose
    public String sentiment;

}