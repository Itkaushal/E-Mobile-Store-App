package com.example.a3dotmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class UserRegister extends AppCompatActivity {
    EditText editTextname, editTextemail, editTextpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_register);
        getSupportActionBar().hide();

        editTextname=findViewById(R.id.ev_name_register);
        editTextemail=findViewById(R.id.ev_email_register);
        editTextpassword=findViewById(R.id.ev_password_register);
    }

    public void registerclick(View view) {
        SharedPreferences sp = getSharedPreferences("MyPrefs",MODE_PRIVATE);
        String newUser=editTextname.getText().toString();
        String newEmail=editTextemail.getText().toString();
        String newPassword=editTextpassword.getText().toString();
        SharedPreferences.Editor editor = sp.edit();

        editor.putString(newUser + newPassword + "data", newUser + "\n" +newEmail);
        editor.commit();
        Intent intent = new Intent(UserRegister.this,UserLogin.class);
        startActivity(intent);
        Toast.makeText(this, "Register Successfully", Toast.LENGTH_SHORT).show();
    }
}