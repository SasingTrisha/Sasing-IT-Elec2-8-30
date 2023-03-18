package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v(TAG, "This is a verbose log.");
        Log.v(TAG, "This is debug log.");
        Log.v(TAG, "This is an info log.");
        Log.v(TAG, "This is a warning log,");
        Log.v(TAG, "This is an error log.");

        Button button = (Button) findViewById(R.id.button4);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
            Log.i(TAG, "Button Clicked");
                Intent intent = new Intent(MainActivity.this, MainFragment.class);
                startActivity(intent);
            }

        });



    }
}