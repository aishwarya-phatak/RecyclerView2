package com.bitcode.recyclerview2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ProductDetailsActivity extends AppCompatActivity {
    private TextView txtProductTitle, txtProductPrice;
    private ImageView imgProduct;

    private int id, price, imageId;
    private String title;
    private Product product;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.products_details);

        initViews();
        extractInput();
    }

    public void initViews(){
        txtProductTitle = findViewById(R.id.txtProductTitle);
        txtProductPrice = findViewById(R.id.txtProductPrice);
        imgProduct = findViewById(R.id.imgProduct);
    }

    public void extractInput(){
        Intent intent = getIntent();
        id = intent.getIntExtra("id",-1);
        title = intent.getStringExtra("title");
        price = intent.getIntExtra("price",0);
        imageId = intent.getIntExtra("imageId", R.mipmap.ic_launcher_round);

        imgProduct.setImageResource(imageId);
        txtProductTitle.setText(title);
        //txtProductPrice.setText(price);
    }
}
