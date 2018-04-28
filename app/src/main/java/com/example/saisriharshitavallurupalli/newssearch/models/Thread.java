package com.example.saisriharshitavallurupalli.newssearch.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Thread {

    @SerializedName("uuid")
    @Expose
    public String uuid;
    @SerializedName("url")
    @Expose
    public String url;
    @SerializedName("site_full")
    @Expose
    public String siteFull;
    @SerializedName("site")
    @Expose
    public String site;
    @SerializedName("site_section")
    @Expose
    public String siteSection;
    @SerializedName("site_categories")
    @Expose
    public List<String> siteCategories = null;
    @SerializedName("section_title")
    @Expose
    public String sectionTitle;
    @SerializedName("title")
    @Expose
    public String title;
    @SerializedName("title_full")
    @Expose
    public String titleFull;
    @SerializedName("published")
    @Expose
    public String published;
    @SerializedName("replies_count")
    @Expose
    public int repliesCount;
    @SerializedName("participants_count")
    @Expose
    public int participantsCount;
    @SerializedName("site_type")
    @Expose
    public String siteType;
    @SerializedName("country")
    @Expose
    public String country;
    @SerializedName("spam_score")
    @Expose
    public double spamScore;
    @SerializedName("main_image")
    @Expose
    public String mainImage;
    @SerializedName("performance_score")
    @Expose
    public int performanceScore;
    @SerializedName("domain_rank")
    @Expose
    public int domainRank;
    @SerializedName("social")
    @Expose
    public Social social;

}
