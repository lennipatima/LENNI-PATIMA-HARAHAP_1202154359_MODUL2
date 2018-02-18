package com.example.lennipatimaharahap.lennipatimaharahap_1202154359_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class Menu extends AppCompatActivity {

    // untuk deklarasi objek
    private final LinkedList<String> foods = new LinkedList<>();
    private final LinkedList<Integer> priceses = new LinkedList<>();
    private final LinkedList<Integer> photos = new LinkedList<>();
    private int mCount = 0;

    private RecyclerView mRecyclerView;
    private MenuAdapter mAdapter;

    // method ketika dijalankan saat activity dibuat
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        dummiesData();
        // Get a handle to the RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        // membuat adapter dan memanggil data yang akan ditampilkan
        mAdapter = new MenuAdapter(this, foods, priceses, photos);
        // menghubungkan adaptor dengan RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // memberikan RecyclerView sebagai pengelola tata letak default.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void dummiesData() {
        for (int i = 0; i < 3; i++) {
            // memberi dan memanggil nama untuk data yang ditampilkan
            foods.add("Bery Fruit");
            foods.add("Chocolate Caramel");
            foods.add("Cookies Chocolate");
            foods.add("Greentea Chocolate");
            foods.add("Strawberry Chocolate");
            foods.add("Choconut Florest");
            foods.add("Choco Rain");
            foods.add("Mint Oreo Desserts");
            foods.add("Ice Cream Variant");

            // mamanggil harga
            priceses.add(20000);
            priceses.add(20000);
            priceses.add(25000);
            priceses.add(20000);
            priceses.add(20000);
            priceses.add(200000);
            priceses.add(200000);
            priceses.add(45000);
            priceses.add(10000);

            // memanggil foto yang ada di drawable
            photos.add(R.drawable.berryfruit);
            photos.add(R.drawable.chocolatecaramel);
            photos.add(R.drawable.cookieschocalate);
            photos.add(R.drawable.greenteachocolate);
            photos.add(R.drawable.strawberrychocolate);
            photos.add(R.drawable.choconutforest);
            photos.add(R.drawable.chocorain);
            photos.add(R.drawable.mintoreodesserts);
            photos.add(R.drawable.icecreamvariant);
        }
    }
}