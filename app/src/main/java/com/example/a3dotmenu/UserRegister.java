package com.example.a3dotmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.a3dotmenu.databinding.ActivityUserRegisterBinding;

public class UserRegister extends AppCompatActivity {
   ActivityUserRegisterBinding binding;
   DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityUserRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        databaseHelper = new DatabaseHelper(this);

        binding.tvButtonReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = binding.evEmailRegister.getText().toString();
                String password = binding.evPassReg.getText().toString();
                String cpassword = binding.evCpassReg.getText().toString();

                if (email.equals("") || password.equals("") || cpassword.equals(""))
                    Toast.makeText(UserRegister.this, "All fields are mandatory", Toast.LENGTH_SHORT).show();
                else {
                    if (password.equals(cpassword)){
                        Boolean checkUserEmail = databaseHelper.checkEmail(email);

                        if (checkUserEmail == false){
                            Boolean insert = databaseHelper.insertData(email,password);

                            if (insert == true){
                                Toast.makeText(UserRegister.this, "Register Success", Toast.LENGTH_SHORT).show();
                                Intent i = new Intent(getApplicationContext(),UserLogin.class);
                                startActivity(i);
                            } else {
                                Toast.makeText(UserRegister.this, "Register Failed!", Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            Toast.makeText(UserRegister.this, "user already exists", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(UserRegister.this, "Password Invalid", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }

    public void login(View view) {
        Intent i = new Intent(getApplicationContext(),UserLogin.class);
        startActivity(i);
    }
}