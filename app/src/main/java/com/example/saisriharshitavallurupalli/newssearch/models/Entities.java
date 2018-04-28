package com.example.saisriharshitavallurupalli.newssearch.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Entities {

    @SerializedName("persons")
    @Expose
    public List<Person> persons = null;
    @SerializedName("organizations")
    @Expose
    public List<Organization> organizations = null;
    @SerializedName("locations")
    @Expose
    public List<Location> locations = null;

}
