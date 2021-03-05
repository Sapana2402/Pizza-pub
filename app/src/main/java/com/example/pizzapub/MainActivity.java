package com.example.pizzapub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.pizzapub.Adapter.Burger_Adapter;
import com.example.pizzapub.Adapter.ComboAdapter;
import com.example.pizzapub.Adapter.OurSpecialAdapter;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView,burger_recyclerview,combo_recyclerview;
    ImageView glass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

glass=findViewById(R.id.glass);

        glass.setAnimation(AnimationUtils.loadAnimation(MainActivity.this,R.anim.splash_anim));

        MyListData[] myListData = new MyListData[] {
                new MyListData( "Margarita","₹299","with 100% real cheese",R.drawable.pizza1),
                new MyListData( "Fresh Veggie","₹399","Golden corn",R.drawable.pizza2),
                new MyListData( "Cheese n Corn","₹199","sweet",R.drawable.pizza3),
                new MyListData( "Margarita","₹499","Spicy",R.drawable.pizza4),
                new MyListData( "Fresh Veggie","₹199","sweet",R.drawable.pizza5),
                new MyListData( "Cheese n Corn","₹499","with real cheese",R.drawable.pizza6),
                new MyListData( "Margarita","₹399","sweet",R.drawable.pizza7),
                new MyListData( "Cheese n Corn","₹99","Sweet & Spicy",R.drawable.pizza8),
                new MyListData( "Cheese n Corn","₹199","with 100% real cheese",R.drawable.pizza9),
                new MyListData( "Margarita","₹499","Sweet & Spicy",R.drawable.pizza10),
                new MyListData( "Fresh Veggie","₹299","sweet",R.drawable.pizza11),
                new MyListData( "Margarita","₹199","Spicy",R.drawable.pizza12),



        };

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        OurSpecialAdapter adapter = new OurSpecialAdapter(myListData);
        recyclerView.setHasFixedSize(true);
       LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
       linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
       recyclerView.setLayoutManager(linearLayoutManager);
       recyclerView.setAdapter(adapter);




        BurgerData[] burgerData = new BurgerData[] {
                new BurgerData( "Cheese Burger","₹199","Cheese, Tomato",R.drawable.b1),
                new BurgerData( "Meet Burger","₹99","Cheese, Olives, Ketchup",R.drawable.b2),
                new BurgerData( "Chicken Burger","₹399","All",R.drawable.b3),
                new BurgerData( "Cheese Burger","₹299","Cheese, Olives",R.drawable.b4),


        };

        burger_recyclerview = (RecyclerView) findViewById(R.id.Burger_recyclerView);
        Burger_Adapter burger_adapter = new Burger_Adapter(burgerData);
        burger_recyclerview.setHasFixedSize(true);
        LinearLayoutManager blinearLayoutManager = new LinearLayoutManager(getApplicationContext());
        blinearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        burger_recyclerview.setLayoutManager(blinearLayoutManager);
        burger_recyclerview.setAdapter(burger_adapter);


        ComboData[] comboData = new ComboData[] {
                new ComboData( "Special Combo","₹799","Pizza, Burger, Chicken",R.drawable.c1),
                new ComboData( "Special Combo","₹599","Pizza, Cold Drinks",R.drawable.c3),
                new ComboData( "Special Combo","₹499","Pizza, Burger",R.drawable.c2),

                new ComboData( "Special Combo","₹399","Pizza, Burger, Cold Drinks",R.drawable.c4),


        };

        combo_recyclerview = (RecyclerView) findViewById(R.id.Combo_recyclerView);
        ComboAdapter comboAdapter = new ComboAdapter(comboData);
        combo_recyclerview.setHasFixedSize(true);
        LinearLayoutManager clinearLayoutManager = new LinearLayoutManager(getApplicationContext());
        clinearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        combo_recyclerview.setLayoutManager(clinearLayoutManager);
        combo_recyclerview.setAdapter(comboAdapter);






    }
}