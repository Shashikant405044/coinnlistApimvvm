package com.example.mvvmjava.adapter;

import static com.example.mvvmjava.databinding.ListItemBinding.bind;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.mvvmjava.R;
import com.example.mvvmjava.databinding.ListItemBinding;
import com.example.mvvmjava.pojo.ListData;

import java.util.ArrayList;
import java.util.List;


public class MainActRecyclerViewAdapter extends RecyclerView.Adapter<MainActRecyclerViewAdapter.MyViewHolder> {
    private Context context;
    private List<ListData> dataList = new ArrayList<>();

    public MainActRecyclerViewAdapter(Context context, List<ListData> dataList) {
        this.context = context;
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public MainActRecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


       ListItemBinding binding = bind(LayoutInflater.from(context).inflate(R.layout.list_item,parent,false));
         return new MyViewHolder(binding);

    }

    @Override
    public void onBindViewHolder(@NonNull MainActRecyclerViewAdapter.MyViewHolder holder, int position) {

        ListData listData = dataList.get(position);
        holder.binding.id.setText(listData.getM_id());
        holder.binding.price.setText(listData.getmPrice());
        holder.binding.age.setText(listData.getmAge());
        holder.binding.history.setText(listData.getmHistory());
        holder.binding.name.setText(listData.getmName());
        holder.binding.year.setText(listData.getmYear());

///*        Glide.with(context)
//                .load(listData.getPictures().getFront().getUrl())
//                .into(holder.binding.url).getView();*/
       Glide.with(context).load(listData.getPictures().getBack().getUrl()).into(holder.binding.url);
    }
    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ListItemBinding binding;
        public MyViewHolder(ListItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
