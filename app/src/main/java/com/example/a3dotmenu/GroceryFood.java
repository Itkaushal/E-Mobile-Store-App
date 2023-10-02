package com.example.a3dotmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GroceryFood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grocery_food);
    }

    public void groceryvegetable(View view) {
        Intent intent = new Intent(GroceryFood.this,Order_grocery.class);
        startActivity(intent);
    }
}