package com.example.a3dotmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Lehnga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lehnga);
    }

    public void lehenga(View view) {
        Intent intent = new Intent(Lehnga.this,Order_lehnga.class);
        startActivity(intent);
    }
}