package com.example.a3dotmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Order_mobile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_mobile);
    }

    public void ordersuccess(View view) {
        Toast.makeText(this, "Order Successfully", Toast.LENGTH_SHORT).show();
    }
}