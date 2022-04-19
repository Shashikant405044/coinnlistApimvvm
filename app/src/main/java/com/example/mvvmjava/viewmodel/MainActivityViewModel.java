package com.example.mvvmjava.viewmodel;
import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.mvvmjava.pojo.MainObject;
import com.example.mvvmjava.repository.RepositoryMainActivity;
public class MainActivityViewModel extends ViewModel {
    Context context;
    RepositoryMainActivity repositoryMainActivity = new RepositoryMainActivity(context);
    public MutableLiveData<MainObject> getDataFormRepo()
    {
        return repositoryMainActivity.getData();

    }
}
