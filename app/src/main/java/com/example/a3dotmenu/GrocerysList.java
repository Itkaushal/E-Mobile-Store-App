package com.example.a3dotmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.example.a3dotmenu.Adapter.MyAdapter;
import com.example.a3dotmenu.Modal.ProductModal;

import java.util.ArrayList;

public class GrocerysList extends AppCompatActivity {
    ListView lv;
    ArrayList<ProductModal> arrayList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grocerys_list);
        lv=findViewById(R.id.lv5);

        ProductModal s1 = new ProductModal();
        s1.setImg(R.drawable.ata);
        s1.setProd("Ata 10kg.");
        s1.setPric("₹- 500");
        arrayList.add(s1);

        ProductModal s2 = new ProductModal();
        s2.setImg(R.drawable.chawal);
        s2.setProd("Rice 10kg.");
        s2.setPric("₹- 300");
        arrayList.add(s2);

        ProductModal s3 = new ProductModal();
        s3.setImg(R.drawable.vegetable);
        s3.setProd("Vegetables 5kg");
        s3.setPric("₹- 400");
        arrayList.add(s3);

        ProductModal s4 = new ProductModal();
        s4.setImg(R.drawable.buiscit);
        s4.setProd("Bikaner Biscit");
        s4.setPric("₹- 50");
        arrayList.add(s4);

        MyAdapter obj=new MyAdapter(this,R.layout.grocerylist_ke_liye_list,arrayList);
        lv.setAdapter(obj);
    }

    public void grocrieesonclick(View view) {
        Toast.makeText(this, "Item not Available", Toast.LENGTH_SHORT).show();
    }
}