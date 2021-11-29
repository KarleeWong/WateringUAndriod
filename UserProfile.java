package com.example.wateringu_userinput;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UserProfile extends AppCompatActivity {
    public static final String USER_NAME = "com.example.application.example.USER_NAME";
    public static final String USER_WEIGHT = "com.example.application.example.USER_WEIGHT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        Button updateButton = (Button)findViewById(R.id.updateButton);
        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain();
            }
        });
    }

    // stores variables and opens main
    public void openMain() {
        EditText editText1 = (EditText) findViewById(R.id.nameInput);
        String name = editText1.getText().toString();

        EditText editText2 = (EditText) findViewById(R.id.weightInput);
        int weight = Integer.parseInt(editText2.getText().toString());

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(USER_NAME, name);
        intent.putExtra(USER_WEIGHT, weight);
        startActivity(intent);
    }
}