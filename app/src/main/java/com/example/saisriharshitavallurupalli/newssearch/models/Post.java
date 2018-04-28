package com.example.saisriharshitavallurupalli.newssearch.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Post {

    @SerializedName("thread")
    @Expose
    public Thread thread;
    @SerializedName("uuid")
    @Expose
    public String uuid;
    @SerializedName("url")
    @Expose
    public String url;
    @SerializedName("ord_in_thread")
    @Expose
    public int ordInThread;
    @SerializedName("author")
    @Expose
    public String author;
    @SerializedName("published")
    @Expose
    public String published;
    @SerializedName("title")
    @Expose
    public String title;
    @SerializedName("text")
    @Expose
    public String text;
    @SerializedName("highlightText")
    @Expose
    public String highlightText;
    @SerializedName("highlightTitle")
    @Expose
    public String highlightTitle;
    @SerializedName("language")
    @Expose
    public String language;
    @SerializedName("external_links")
    @Expose
    public List<Object> externalLinks = null;
    @SerializedName("entities")
    @Expose
    public Entities entities;
    @SerializedName("rating")
    @Expose
    public Object rating;
    @SerializedName("crawled")
    @Expose
    public String crawled;

}
