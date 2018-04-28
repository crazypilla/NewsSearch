package com.example.saisriharshitavallurupalli.newssearch.models;



import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Social {

    @SerializedName("facebook")
    @Expose
    public Facebook facebook;
    @SerializedName("gplus")
    @Expose
    public Gplus gplus;
    @SerializedName("pinterest")
    @Expose
    public Pinterest pinterest;
    @SerializedName("linkedin")
    @Expose
    public Linkedin linkedin;
    @SerializedName("stumbledupon")
    @Expose
    public Stumbledupon stumbledupon;
    @SerializedName("vk")
    @Expose
    public Vk vk;

}