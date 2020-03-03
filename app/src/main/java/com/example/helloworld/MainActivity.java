package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;

import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.Button;

import android.content.Intent;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

     public static final String EXTRA_MESSAGE = "xdxd";
     public static final String TAG = "MainActivity"; 


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = findViewById(R.id.button);

        Log.d(TAG, "button");




    }



       public void openDetailActivity(View view) {
           Intent intent = new Intent(this, DetailActivity.class);
           TextView textView = findViewById(R.id.textView);
           String message = "BTC";
           intent.putExtra(EXTRA_MESSAGE, message);
           startActivity(intent);
        }





    }

