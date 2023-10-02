package com.example.a3dotmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BartanKitchen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bartan_kitchen);
    }

    public void bartan(View view) {
        Intent intent = new Intent(BartanKitchen.this,Order_bartan.class);
        startActivity(intent);
    }
}