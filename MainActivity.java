package com.example.wateringu_userinput;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String name = intent.getStringExtra(UserProfile.USER_NAME);
        int weight = intent.getIntExtra(UserProfile.USER_WEIGHT, 137);

        TextView textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setText("hello " + name + ",");
    }
}