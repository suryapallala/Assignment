package com.doctalk.assignment.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.doctalk.assignment.R;
import com.doctalk.assignment.model.items;

import java.util.List;

/**
 * Created by surya on 27/1/18.
 */

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHoler> {

    Context context;
    List<items> items;

    public MyRecyclerViewAdapter(Context context, List<com.doctalk.assignment.model.items> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public MyRecyclerViewAdapter.MyViewHoler onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHoler(LayoutInflater.from(context).inflate(R.layout.item_view,parent,false));
    }

    @Override
    public void onBindViewHolder(MyRecyclerViewAdapter.MyViewHoler holder, int position) {
        holder.name.setText(items.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class MyViewHoler extends RecyclerView.ViewHolder{

        TextView name;
        public MyViewHoler(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.item_name);
        }

    }
}
