package com.example.saisriharshitavallurupalli.newssearch.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Facebook {

    @SerializedName("likes")
    @Expose
    public int likes;
    @SerializedName("comments")
    @Expose
    public int comments;
    @SerializedName("shares")
    @Expose
    public int shares;

}
