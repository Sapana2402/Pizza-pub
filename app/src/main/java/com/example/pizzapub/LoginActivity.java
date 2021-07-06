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

public class LoginActivity extends AppCompatActivity {
    LinearLayout l2;
    EditText Login_email,Login_password;
    Button login;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        Login_email=findViewById(R.id.user_login_email);
        Login_password=findViewById(R.id.user_login_password);
        login=findViewById(R.id.login_user);
        l2=findViewById(R.id.l2);

        l2.setAnimation(AnimationUtils.loadAnimation(LoginActivity.this,R.anim.pizza_animation));

        mAuth = FirebaseAuth.getInstance();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email,password;
                email=Login_email.getText().toString();
                password=Login_password.getText().toString();



                if (TextUtils.isEmpty(email)){
                    Login_email.setError("Please enter email");

                }
                else if (TextUtils.isEmpty(password)){
                    Login_password.setError("Please enter password");
                }
                else {
                    mAuth.signInWithEmailAndPassword(email,password)
                            .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()){
                                        Intent loginIntent = new Intent(LoginActivity.this,MainActivity.class);
                                        loginIntent.putExtra("email",email);
                                        startActivity(loginIntent);
                                    }else{
                                        Toast.makeText(LoginActivity.this,"Login Unsuccessfully",Toast.LENGTH_LONG)
                                                .show();

                                    }
                                }
                            });
                }
            }
        });
    }
}