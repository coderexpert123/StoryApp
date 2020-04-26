package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        getSupportActionBar().hide();
    }

    public void loginn(View view) {
        Intent i = new Intent(signup.this,login.class);
        startActivity(i);
    }


    public void dahdj(View view) {


        Intent i = new Intent(signup.this,dashboard.class);
        startActivity(i);
    }
}

