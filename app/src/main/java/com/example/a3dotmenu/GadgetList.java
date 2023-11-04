package com.example.a3dotmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.example.a3dotmenu.Adapter.MyAdapter;
import com.example.a3dotmenu.Modal.ProductModal;

import java.util.ArrayList;

public class GadgetList extends AppCompatActivity {
    ListView lv;
    ArrayList<ProductModal> arrayList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gadget_list);
        lv=findViewById(R.id.lv);

        ProductModal s1 = new ProductModal();
        s1.setImg(R.drawable.galaxy23);
        s1.setProd("Galaxy S23");
        s1.setPric("₹- 80,000");
        arrayList.add(s1);

        ProductModal s2 = new ProductModal();
        s2.setImg(R.drawable.vivo29);
        s2.setProd("Vivo v29");
        s2.setPric("₹- 30,000");
        arrayList.add(s2);

        ProductModal s3 = new ProductModal();
        s3.setImg(R.drawable.iphone15);
        s3.setProd("Iphone 15");
        s3.setPric("₹- 85,000");
        arrayList.add(s3);

        ProductModal s4 = new ProductModal();
        s4.setImg(R.drawable.onepluse_10r);
        s4.setProd("Oneplus 10r");
        s4.setPric("₹- 49,999");
        arrayList.add(s4);

        MyAdapter obj=new MyAdapter(this,R.layout.gadjetlist_ke_liye_list,arrayList);
        lv.setAdapter(obj);
    }

    public void gadjetclickon(View view) {
        Toast.makeText(this, "Item Not Available", Toast.LENGTH_SHORT).show();
    }
}
