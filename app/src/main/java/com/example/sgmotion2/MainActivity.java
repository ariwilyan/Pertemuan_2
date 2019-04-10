package com.example.sgmotion2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.LinearLayout;

import com.example.sgmotion2.Adapter.ListMenuAdapter;
import com.example.sgmotion2.Model.Makanan;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Makanan> makananList = new ArrayList<>();
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_list_makanan);
        makananList.add(new Makanan("Ayam Bakar",12000));
        makananList.add(new Makanan("Belut Goreng", 10000));
        makananList.add(new Makanan("Rica Rica Siput", 10000));
        makananList.add(new Makanan("Ayam Bakar", 10000));
        makananList.add(new Makanan("Ayam Bakar", 10000));

        adapter = new ListMenuAdapter(this,makananList);
        layoutManager = new LinearLayoutManager(this, LinearLayout.VERTICAL, false);
        //layoutManager = new LinearLayoutManager(this, LinearLayout.HORIZONTAL, false);
        //layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("ListMenu");
    }
}
