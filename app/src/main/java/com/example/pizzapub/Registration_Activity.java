package com.example.pizzapub;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Registration_Activity extends AppCompatActivity {
    EditText ragister_email,ragister_password,ragister_confirmpassword;
    Button ragistation,redirect_login;
    LinearLayout l1;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_);

        ragister_email=findViewById(R.id.usee_email);
        ragister_password=findViewById(R.id.user_password);
        ragister_confirmpassword=findViewById(R.id.user_confirmpassword);
        ragistation=findViewById(R.id.ragistation_btn);
        redirect_login=findViewById(R.id.redirect_login);
        l1=findViewById(R.id.l1);

        l1.setAnimation(AnimationUtils.loadAnimation(Registration_Activity.this,R.anim.pizza_animation));


        mAuth = FirebaseAuth.getInstance();


        redirect_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginintent = new Intent(Registration_Activity.this,LoginActivity.class);
                startActivity(loginintent);
            }
        });


        ragistation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email,password,confirmpassword;
                email=ragister_email.getText().toString();
                password=ragister_password.getText().toString();
                confirmpassword=ragister_confirmpassword.getText().toString();


                if (TextUtils.isEmpty(email)){
                    ragister_email.setError("Please enter email");

                }
                else if (TextUtils.isEmpty(password)){
                    ragister_password.setError("Please enter password");
                }else if (password.length()<6){
                    ragister_password.setError("password must be greater than 6 digits");
                }
                else if (TextUtils.isEmpty(confirmpassword)){
                    ragister_confirmpassword.setError("Please enter confirm passsword");
                }else if (!(confirmpassword.equals(password))){
                    ragister_confirmpassword.setError("password is not equal");
                }else {
                    mAuth.createUserWithEmailAndPassword(email,password)
                            .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()){
                                        Intent loginintent = new Intent(Registration_Activity.this,MainActivity.class);
                                        startActivity(loginintent);
                                    }else{
                                        Toast.makeText(Registration_Activity.this,"Ragister Unsuccessfully",Toast.LENGTH_LONG)
                                                .show();

                                    }
                                }
                            });
                }
            }
        });
    }
}