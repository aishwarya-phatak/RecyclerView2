package com.bitcode.recyclerview2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Product> products;
    private RecyclerView recyclerProducts;
    private ProductsAdapter productsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initViews();
    }

    public void initViews(){
        recyclerProducts = findViewById(R.id.recyclerProducts);
        recyclerProducts.setLayoutManager(
                new LinearLayoutManager(
                        this,
                        LinearLayoutManager.VERTICAL,
                        false
                ));

        productsAdapter = new ProductsAdapter(products);
        recyclerProducts.setAdapter(productsAdapter);
    }

    public void initData(){
        products = new ArrayList<Product>();
        for(int i=0;i<21;i++){
            products.add(
                    new Product(
                            i,
                            "Product"+i,
                            R.mipmap.ic_launcher,
                            100*i+5
                    )
            );
        }
    }

}