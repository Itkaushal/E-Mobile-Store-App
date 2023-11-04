package com.example.a3dotmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.a3dotmenu.databinding.ActivityUserLoginBinding;

public class UserLogin extends AppCompatActivity {
    ActivityUserLoginBinding binding;
    DatabaseHelper databaseHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityUserLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        databaseHelper = new DatabaseHelper(this);


        binding.loginbuttonTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = binding.evEmailLog.getText().toString();
                String password = binding.evPasswordLogin.getText().toString();

                if (email.equals("") || password.equals(""))
                    Toast.makeText(UserLogin.this, "All fields are mandatory", Toast.LENGTH_SHORT).show();
                else {
                    Boolean checkCredential = databaseHelper.checkEmailPassword(email,password);

                    if (checkCredential == true){
                        Toast.makeText(UserLogin.this, "Login Success", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(UserLogin.this, "Invalid Credential!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        binding.registerButtonOnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),UserRegister.class);
                startActivity(i);
            }
        });
    }
}

