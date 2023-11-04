package com.example.a3dotmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.example.a3dotmenu.Adapter.MyAdapter;
import com.example.a3dotmenu.Modal.ProductModal;

import java.util.ArrayList;

public class AcceriesList extends AppCompatActivity {
    ListView lv;
   public ArrayList<ProductModal> arrayList=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceries_list);
        lv=findViewById(R.id.lv2);

        ProductModal s1 = new ProductModal();
        s1.setImg(R.drawable.cableusb);
        s1.setProd("USB cable");
        s1.setPric("₹- 150");
        arrayList.add(s1);

        ProductModal s2 = new ProductModal();
        s2.setImg(R.drawable.headphone);
        s2.setProd("Headphone Boat");
        s2.setPric("₹- 1,999");
        arrayList.add(s2);

        ProductModal s3 = new ProductModal();
        s3.setImg(R.drawable.mouse);
        s3.setProd("Mouse wireless");
        s3.setPric("₹- 550");
        arrayList.add(s3);

        ProductModal s4 = new ProductModal();
        s4.setImg(R.drawable.kyboard);
        s4.setProd("Keyboard PC");
        s4.setPric("₹- 399");
        arrayList.add(s4);

        MyAdapter obj=new MyAdapter(this,R.layout.accsrieslist_ke_liye_list,arrayList);
        lv.setAdapter(obj);
    }

    public void acceriesonclick(View view) {
        Toast.makeText(this, "item not Available", Toast.LENGTH_SHORT).show();
    }
}