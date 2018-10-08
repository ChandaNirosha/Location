package com.example.sys9.location;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
    Context context;
    ArrayList<String> arrayList;
    public CustomAdapter(Context context, ArrayList<String> arrayList) {
        this.arrayList=arrayList;
        this.context=context;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View customview;
        view= LayoutInflater.from(context).inflate(R.layout.activity_custom_adapter, viewGroup, false);
        TextView latitude=view.findViewById(R.id.text1);
        latitude.setText(arrayList.get(i));
        TextView longitude=view.findViewById(R.id.text2);
        longitude.setText(arrayList.get(i));
        customview=view;
        return customview;
    }
}