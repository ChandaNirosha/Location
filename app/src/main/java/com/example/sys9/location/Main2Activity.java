package com.example.sys9.location;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    ListView listView;
    ArrayList<String> arrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listView=findViewById(R.id.listview);
        ExampleDB db=new ExampleDB(this);
        //ArrayList<String> arrayList=new ArrayList<>();
        arrayList = (ArrayList<String>) db.getDataFromDataBase();
        CustomAdapter adapter = new CustomAdapter(this, arrayList);
        listView.setAdapter(adapter);

    }
}
