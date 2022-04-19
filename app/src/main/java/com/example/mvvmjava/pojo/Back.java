package com.example.mvvmjava.pojo;

import com.google.gson.annotations.SerializedName;

public class Back {
    @SerializedName("key")
    private String key;
    @SerializedName("url")
    private String url;

    @SerializedName("sizeInMegaByte")
    private String sizeInMegaByte;

    public String getKey() {
        return key;
    }

    public String getUrl() {
        return url;
    }

    public String getSizeInMegaByte() {
        return sizeInMegaByte;
    }
}
