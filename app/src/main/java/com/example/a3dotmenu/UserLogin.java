package com.example.a3dotmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class UserLogin extends AppCompatActivity {
   EditText editTextnamelogin,editTextpasswordlogin;
   TextView textViewloginbutton, textViewregisterbuttonOnlogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);
        getSupportActionBar().hide();
        editTextnamelogin=findViewById(R.id.ev_name_login);
        editTextpasswordlogin=findViewById(R.id.ev_password_login);
        textViewloginbutton=findViewById(R.id.loginbutton_tv);
        textViewregisterbuttonOnlogin=findViewById(R.id.register_buttonOnLogin);
        textViewloginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username=editTextnamelogin.getText().toString();
                String password=editTextpasswordlogin.getText().toString();

                SharedPreferences sp = getSharedPreferences("MyPrefs",MODE_PRIVATE);
                String userinformation = sp.getString(username + password + "data", "Username or Password is Incorrect");
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("display",userinformation);
                editor.commit();

                    Intent intent = new Intent(UserLogin.this,MainActivity.class);
                    startActivity(intent);
                    Toast.makeText(UserLogin.this, "Login Success", Toast.LENGTH_SHORT).show();

            }
        });


        textViewregisterbuttonOnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(UserLogin.this,UserRegister.class);
                startActivity(i);
            }
        });
    }
}

