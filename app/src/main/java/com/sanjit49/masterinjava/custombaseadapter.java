package com.sanjit49.masterinjava;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class custombaseadapter extends BaseAdapter {
    Context context;
    String listfruits[];
    String listImages[];
    LayoutInflater inflater;
    public custombaseadapter(Context ctx,String[] listfruits,String[] images){
        this.context=ctx;
        this.listfruits=listfruits;
        this.listImages=images;
        inflater=LayoutInflater.from(ctx);
    }

    @Override
    public int getCount() {
        return listfruits.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @SuppressLint({"ViewHolder", "InflateParams"})
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
       view=inflater.inflate(R.layout.activity_custumlistview,null);
        TextView fruitimg= (TextView) view.findViewById(R.id.textView);
        TextView textView1=(TextView) view.findViewById(R.id.textView2);
        textView1.setText(listfruits[i]);
        fruitimg.setText(listImages[i]);
        return view;
    }
}
