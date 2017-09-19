package com.example.abdul_wahab.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class HelloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        // Explicit Intent
/*
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("key1", "value1");

        startActivity(intent);
*/

// Implicit Intent

        Intent sendIntent = new Intent();

        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
        sendIntent.setType("text/plain");


        startActivity(sendIntent);


    }
}
