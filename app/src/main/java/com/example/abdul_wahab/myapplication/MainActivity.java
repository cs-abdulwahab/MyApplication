package com.example.abdul_wahab.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MTAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // getting the data

        Intent intent = getIntent();
        String val = intent.getStringExtra("key1");

        Log.d(TAG, "onCreate: " + val);


    }
}
