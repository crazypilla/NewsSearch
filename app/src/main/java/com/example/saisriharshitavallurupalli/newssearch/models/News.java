package com.example.saisriharshitavallurupalli.newssearch.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class News {

    @SerializedName("posts")
    @Expose
    public List<Post> posts = null;
    @SerializedName("totalResults")
    @Expose
    public int totalResults;
    @SerializedName("moreResultsAvailable")
    @Expose
    public int moreResultsAvailable;
    @SerializedName("next")
    @Expose
    public String next;
    @SerializedName("requestsLeft")
    @Expose
    public int requestsLeft;

}