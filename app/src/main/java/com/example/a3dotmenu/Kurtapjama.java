package com.example.a3dotmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Kurtapjama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kurtapjama);
    }

    public void kurtapjama(View view) {
        Intent intent = new Intent(Kurtapjama.this,Order_kurtapjama.class);
        startActivity(intent);

    }
}