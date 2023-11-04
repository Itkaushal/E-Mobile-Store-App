package com.example.a3dotmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.example.a3dotmenu.Adapter.MyAdapter;
import com.example.a3dotmenu.Modal.ProductModal;

import java.util.ArrayList;

public class VehiclsList extends AppCompatActivity {

    ListView lv;
    ArrayList<ProductModal> arrayList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicls_list);

        lv=findViewById(R.id.lv4);

        ProductModal s1 = new ProductModal();
        s1.setImg(R.drawable.splendor);
        s1.setProd("Splendor i3s");
        s1.setPric("₹- 75,000");
        arrayList.add(s1);

        ProductModal s2 = new ProductModal();
        s2.setImg(R.drawable.ktm);
        s2.setProd("R15 sports");
        s2.setPric("₹- 2,50000");
        arrayList.add(s2);

        ProductModal s3 = new ProductModal();
        s3.setImg(R.drawable.classic350);
        s3.setProd("Bullet 350");
        s3.setPric("₹- 300000");
        arrayList.add(s3);

        ProductModal s4 = new ProductModal();
        s4.setImg(R.drawable.scooty);
        s4.setProd("Activa Scooty");
        s4.setPric("₹- 70,000");
        arrayList.add(s4);

        MyAdapter obj=new MyAdapter(this,R.layout.vehiclelist_ke_liye_list,arrayList);
        lv.setAdapter(obj);
    }

    public void vehiclesonclick(View view) {
        Toast.makeText(this, "Item not available", Toast.LENGTH_SHORT).show();
    }
}