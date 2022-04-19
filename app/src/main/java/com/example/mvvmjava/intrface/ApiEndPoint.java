package com.example.mvvmjava.intrface;

import com.example.mvvmjava.pojo.MainObject;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiEndPoint {
    @GET("/coinlist")
    Call<MainObject> getAllMainData();

}
