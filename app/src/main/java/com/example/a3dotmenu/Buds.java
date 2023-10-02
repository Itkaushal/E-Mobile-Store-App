package com.example.a3dotmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class Buds extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buds);
    }

    public void budsboat(View view) {
        Intent intent = new Intent(Buds.this,Order_buds.class);
        startActivity(intent);
    }
}