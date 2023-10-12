package com.example.a3dotmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class contact_us extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
    }

    public void Goto_home(View view) {
        Intent intent = new Intent(contact_us.this,Profile.class);
        startActivity(intent);
        Toast.makeText(this, "go to profile...", Toast.LENGTH_SHORT).show();
    }

    public void toastclick(View view) {
        Toast.makeText(this, "click whatsapp", Toast.LENGTH_SHORT).show();
    }

    public void toastclick_email(View view) {
        Toast.makeText(this, "click email", Toast.LENGTH_SHORT).show();
    }

    public void toastclick_mobile(View view) {
        Toast.makeText(this, "click call", Toast.LENGTH_SHORT).show();
    }
}