package com.example.mvvmjava.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;

import com.example.mvvmjava.R;
import com.example.mvvmjava.adapter.MainActRecyclerViewAdapter;
import com.example.mvvmjava.databinding.ActivityMainBinding;
import com.example.mvvmjava.pojo.ListData;
import com.example.mvvmjava.pojo.MainObject;
import com.example.mvvmjava.viewmodel.MainActivityViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    MainActivityViewModel mainActivityViewModel;
    ActivityMainBinding binding;
    MainActRecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
         binding.recyclerView.setLayoutManager(linearLayoutManager);



        mainActivityViewModel = new  ViewModelProvider(this).get(MainActivityViewModel.class);
        mainActivityViewModel.getDataFormRepo().observe(this, new Observer<MainObject>() {
           @Override
           public void onChanged(MainObject mainObject) {

               List<ListData> list = new ArrayList<>();
                 list = mainObject.getData().getList();

               Log.d("TAG", "onChanged: "+list);
               adapter = new MainActRecyclerViewAdapter(MainActivity.this,list);
               binding.recyclerView.setAdapter(adapter);
           }
       });



    }
}