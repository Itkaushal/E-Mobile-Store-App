package com.example.a3dotmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.example.a3dotmenu.Adapter.MyAdapter;
import com.example.a3dotmenu.Modal.ProductModal;

import java.util.ArrayList;

public class ClothList extends AppCompatActivity {

    ListView lv;
    ArrayList<ProductModal> arrayList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cloth_list);

        lv=findViewById(R.id.lv3);

        ProductModal s1 = new ProductModal();
        s1.setImg(R.drawable.kurta);
        s1.setProd("Kurta for Men");
        s1.setPric("₹- 450");
        arrayList.add(s1);

        ProductModal s2 = new ProductModal();
        s2.setImg(R.drawable.shirt);
        s2.setProd("Shirt cotton");
        s2.setPric("₹- 599");
        arrayList.add(s2);

        ProductModal s3 = new ProductModal();
        s3.setImg(R.drawable.jeans);
        s3.setProd("Jeans for Girls");
        s3.setPric("₹- 1500");
        arrayList.add(s3);

        ProductModal s4 = new ProductModal();
        s4.setImg(R.drawable.lehngaa);
        s4.setProd("Lehngaa for wedds");
        s4.setPric("₹- 3,999");
        arrayList.add(s4);

        MyAdapter obj=new MyAdapter(this,R.layout.clothlist_ke_liye_list,arrayList);
        lv.setAdapter(obj);
    }

    public void clothsonclick(View view) {
        Toast.makeText(this, "Item not Available", Toast.LENGTH_SHORT).show();
    }
}