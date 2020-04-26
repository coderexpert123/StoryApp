package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();
    }



    public void foregeet(View view) {

        Intent i = new Intent(login.this,forget.class);
        startActivity(i);
    }

    public void signupnow(View view) {
        Intent i = new Intent(login.this,signup.class);
        startActivity(i);
    }
}
