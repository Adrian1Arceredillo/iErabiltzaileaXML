package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Hola", "Adrian");
        Log.d("MainActivity", "Hello World Debug message");
        Log.i("MainActivity", "Hello World Info message");
        Log.w("MainActivity", "Hello World Warning message");
        Log.e("MainActivity", "Hello World Error message");
        Log.v("MainActivity", "Hello World Verbose message");

    }
}