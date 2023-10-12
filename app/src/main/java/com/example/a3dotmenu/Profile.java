package com.example.a3dotmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class Profile extends AppCompatActivity {
  TextView textViewdisplayinfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        SharedPreferences sp =getSharedPreferences("MyPrefs",MODE_PRIVATE);
        String display = sp.getString("display", "");

        textViewdisplayinfo=findViewById(R.id.display_textview);
        textViewdisplayinfo.setText(display);

    }
}