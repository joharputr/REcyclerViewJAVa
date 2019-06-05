package com.example.recyclerviewjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Model> mArrayList = new ArrayList<>();
    private RecyclerView mrecyclerView;
    private RecyclerViewAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mrecyclerView = findViewById(R.id.rec);
        mAdapter = new RecyclerViewAdapter(mArrayList);
        mrecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        mrecyclerView.setAdapter(mAdapter);
        prepareData();
    }

    private void prepareData() {
        Model model = null;
        model = new Model("dede","12");
        mArrayList.add(model);
        mAdapter.notifyDataSetChanged();
    }


}
