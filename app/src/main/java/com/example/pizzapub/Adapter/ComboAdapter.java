package com.example.pizzapub.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pizzapub.ComboData;
import com.example.pizzapub.MyListData;
import com.example.pizzapub.R;

public class ComboAdapter extends RecyclerView.Adapter<ComboAdapter.ComboViewHolder> {
    private ComboData[] combolistdata;

    public ComboAdapter(ComboData[] combolistdata) {
        this.combolistdata = combolistdata;
    }

    @NonNull
    @Override
    public ComboViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.combo_row, parent, false);
        ComboAdapter.ComboViewHolder viewHolder = new ComboAdapter.ComboViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ComboViewHolder holder, int position) {
        final ComboData comboData = combolistdata[position];

        holder.combo_imageId.setImageResource(combolistdata[position].getCombo_imageId());
        holder.combo_name.setText(combolistdata[position].getCombo_name());
        holder.combo_prize.setText(combolistdata[position].getCombo_prize());
        holder.combo_description.setText(combolistdata[position].getCombo_description());

    }

    @Override
    public int getItemCount() {
        return combolistdata.length;
    }

    public static class ComboViewHolder extends RecyclerView.ViewHolder {
        public ImageView combo_imageId;
        public TextView combo_name,combo_prize,combo_description;

        public ComboViewHolder(View itemView) {
            super(itemView);
            this.combo_imageId = (ImageView) itemView.findViewById(R.id.co_image);
            this.combo_name = (TextView) itemView.findViewById(R.id.co_name);
            this.combo_prize = (TextView) itemView.findViewById(R.id.co_prize);
            this.combo_description = (TextView) itemView.findViewById(R.id.co_description);


        }
    }
}
