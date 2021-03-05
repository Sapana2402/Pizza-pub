package com.example.pizzapub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PizzaOnClickDisplay extends AppCompatActivity {
ImageView pizzaimage;
TextView pizzaname,pizzaprize,pizzadescription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_on_click_display);
        pizzaimage=findViewById(R.id.pizzaimage);
        pizzaname=findViewById(R.id.pizzaname);
        pizzaprize=findViewById(R.id.pizzaprize);
        pizzadescription=findViewById(R.id.pizzadescription);



     //   pizzaimage.setImageResource(myListData.getImageId());
       // pizzaname.setText(myListData.getName());
      //  pizzaprize.setText(myListData.getPrize());
      //  pizzadescription.setText(myListData.getDescription());

pizzaimage.setImageResource(getIntent().getIntExtra("imagename",0));
        pizzaname.setText(getIntent().getStringExtra("ename"));
        pizzaprize.setText(getIntent().getStringExtra("prize"));
        pizzadescription.setText(getIntent().getStringExtra("description"));

    }
}