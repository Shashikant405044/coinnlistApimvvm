
package com.example.mvvmjava.pojo;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListData {

    @SerializedName("age")
    private String mAge;
    @SerializedName("history")
    private String mHistory;
    @SerializedName("isCoin")
    private Boolean mIsCoin;
    @SerializedName("isGraded")
    private Boolean mIsGraded;
    @SerializedName("isSold")
    private Boolean mIsSold;
    @SerializedName("name")
    private String mName;
    @SerializedName("price")
    private String mPrice;
    @SerializedName("tags")
    private java.util.List<String> mTags;
    @SerializedName("year")
    private String mYear;
    @SerializedName("_id")
    private String m_id;
    @SerializedName("pictures")
    private Pictures pictures;


    public String getmAge() {
        return mAge;
    }

    public String getmHistory() {
        return mHistory;
    }

    public Boolean getmIsCoin() {
        return mIsCoin;
    }

    public Boolean getmIsGraded() {
        return mIsGraded;
    }

    public Boolean getmIsSold() {
        return mIsSold;
    }

    public String getmName() {
        return mName;
    }

    public String getmPrice() {
        return mPrice;
    }

    public List<String> getmTags() {
        return mTags;
    }

    public String getmYear() {
        return mYear;
    }

    public String getM_id() {
        return m_id;
    }

    public Pictures getPictures() {
        return pictures;
    }
}