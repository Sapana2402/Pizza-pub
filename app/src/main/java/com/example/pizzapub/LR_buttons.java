package com.example.pizzapub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class LR_buttons extends AppCompatActivity {
TextView Logintext,Registrationtext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l_r_buttons);
        Logintext=findViewById(R.id.Login_Text);
        Registrationtext=findViewById(R.id.Ragistation_text);



        Logintext.setAnimation(AnimationUtils.loadAnimation(LR_buttons.this,R.anim.pizza_animation));

        Registrationtext.setAnimation(AnimationUtils.loadAnimation(LR_buttons.this,R.anim.lr_buttons_anim));


        Logintext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Loginintent=new Intent(LR_buttons.this,LoginActivity.class);
                startActivity(Loginintent);
            }
        });

        Registrationtext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Registrationintent=new Intent(LR_buttons.this,Registration_Activity.class);
                startActivity(Registrationintent);
            }
        });
    }
}