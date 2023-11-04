package com.example.a3dotmenu.Adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.a3dotmenu.Modal.ProductModal;
import com.example.a3dotmenu.R;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
    Activity obj;
    int res;
   public ArrayList<ProductModal> al =new ArrayList<>();

   public MyAdapter(Activity obj,int res,ArrayList<ProductModal>al)
    {
        this.obj=obj;
        this.res=res;
        this.al=al;
    }


    @Override
    public int getCount() {
        return al.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v= LayoutInflater.from(obj).inflate(res,viewGroup,false);
        ProductModal s= al.get(i);
        ImageView iv= v.findViewById(R.id.iv_image);
        TextView tvproduct=v.findViewById(R.id.tv_product);
        TextView tvprice=v.findViewById(R.id.tv_price);
        iv.setImageResource(s.getImg());
        tvproduct.setText(s.getProd());
        tvprice.setText(s.getPric());
        return v;
    }
}
