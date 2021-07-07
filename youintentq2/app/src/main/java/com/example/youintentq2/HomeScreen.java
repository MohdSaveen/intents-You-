package com.example.youintentq2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomeScreen extends AppCompatActivity {
private TextView mtvemail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        mtvemail=findViewById(R.id.tvemail);
        Intent intent=getIntent();
        String name=intent.getStringExtra("key");
            mtvemail.setText(name);

    }
}