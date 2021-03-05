package com.example.pizzapub.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.solver.state.State;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pizzapub.MyListData;
 import com.example.pizzapub.PizzaOnClickDisplay;
import com.example.pizzapub.R;

import java.util.ArrayList;

public class OurSpecialAdapter extends RecyclerView.Adapter<OurSpecialAdapter.ViewHolder> {
    private MyListData[] listdata;

    // RecyclerView recyclerView;


    public OurSpecialAdapter(MyListData[] listdata) {
        this.listdata = listdata;

    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.ouespecial_row, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

     
        final MyListData myListData = listdata[position];

        holder.imageId.setImageResource(listdata[position].getImageId());
        holder.name.setText(listdata[position].getName());
        holder.prize.setText(listdata[position].getPrize());
        holder.description.setText(listdata[position].getDescription());


    }


    @Override
    public int getItemCount() {
        return listdata.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageId;
        public TextView name,prize,description;
        LinearLayout container;
        public ViewHolder(View itemView) {
            super(itemView);
            this.imageId = (ImageView) itemView.findViewById(R.id.os_image);
            this.name = (TextView) itemView.findViewById(R.id.os_name);
            this.prize = (TextView) itemView.findViewById(R.id.os_prize);
            this.description = (TextView) itemView.findViewById(R.id.os_description);
            this.container =  itemView.findViewById(R.id.container);


        }
    }
}