package com.example.mvvmjava.repository;

import android.content.Context;
import android.widget.Toast;

import androidx.lifecycle.MutableLiveData;

import com.example.mvvmjava.constant.RetrofitApi;
import com.example.mvvmjava.intrface.ApiEndPoint;
import com.example.mvvmjava.pojo.MainObject;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RepositoryMainActivity {

    Context context;

    public RepositoryMainActivity(Context context) {
        this.context = context;
    }

    List<MainObject> mainObjects = new ArrayList<>();
    MutableLiveData<MainObject> mutableLiveData =new MutableLiveData<MainObject>();

   public MutableLiveData<MainObject> getData(){

       ApiEndPoint apiEndPoint = RetrofitApi.getInstance(ApiEndPoint.class);
        Call<MainObject> call =  apiEndPoint.getAllMainData();
        call.enqueue(new Callback<MainObject>() {
            @Override
            public void onResponse(Call<MainObject> call, Response<MainObject> response) {

                mutableLiveData.postValue(response.body());

            }

            @Override
            public void onFailure(Call<MainObject> call, Throwable t) {
                Toast.makeText(context, ""+t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
       return mutableLiveData;

    }


}
