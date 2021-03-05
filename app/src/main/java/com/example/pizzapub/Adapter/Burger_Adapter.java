package com.example.pizzapub.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pizzapub.BurgerData;
import com.example.pizzapub.MyListData;
import com.example.pizzapub.R;

public class Burger_Adapter extends RecyclerView.Adapter<Burger_Adapter.BurgerViewHolder>{
    private BurgerData[] burgerlistData;

    public Burger_Adapter(BurgerData[] burgerData) {
        this.burgerlistData = burgerData;
    }

    @NonNull
    @Override
    public BurgerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.burger_row, parent, false);
        Burger_Adapter.BurgerViewHolder viewHolder = new Burger_Adapter.BurgerViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BurgerViewHolder holder, int position) {
        final BurgerData burgerData = burgerlistData[position];

        holder.burger_imageId.setImageResource(burgerlistData[position].getBurger_imageId());
        holder.burger_name.setText(burgerlistData[position].getBurger_name());
        holder.burger_prize.setText(burgerlistData[position].getBurger_prize());
        holder.burger_description.setText(burgerlistData[position].getBurger_description());
    }

    @Override
    public int getItemCount() {
        return burgerlistData.length;
    }

    public static class BurgerViewHolder extends RecyclerView.ViewHolder {
        public ImageView burger_imageId;
        public TextView burger_name,burger_description,burger_prize;

        public BurgerViewHolder(View itemView) {
            super(itemView);
            this.burger_imageId = (ImageView) itemView.findViewById(R.id.b_image);
            this.burger_name = (TextView) itemView.findViewById(R.id.b_name);
            this.burger_prize = (TextView) itemView.findViewById(R.id.b_prize);
            this.burger_description = (TextView) itemView.findViewById(R.id.b_description);


        }
    }


}
