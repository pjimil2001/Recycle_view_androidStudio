package com.example.recycle_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

//    LinearLayoutManager HorizontalLayout;

    RecyclerView rv;
    ArrayList<recyclemodel> dm= new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv=findViewById(R.id.rv);


        dm.add(new recyclemodel("asd"));
        dm.add(new recyclemodel("asd1"));
        dm.add(new recyclemodel("asd3"));
        dm.add(new recyclemodel("asd4"));
        dm.add(new recyclemodel("asd5"));
        dm.add(new recyclemodel("asd6"));
        dm.add(new recyclemodel("asd7"));
        dm.add(new recyclemodel("asd8"));
        dm.add(new recyclemodel("asd9"));  
        dm.add(new recyclemodel("asdw"));
        dm.add(new recyclemodel("asdq"));
        dm.add(new recyclemodel("asdew"));
        dm.add(new recyclemodel("asdwe"));
        dm.add(new recyclemodel("asdw"));



        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new recleadapter(dm));
//
//        HorizontalLayout= new LinearLayoutManager(MainActivity.this,
//                LinearLayoutManager.HORIZONTAL,
//                false);
//        rv.setLayoutManager(HorizontalLayout);



    }
}