package com.bitcode.recyclerview2;

import java.io.Serializable;

public class Product {
    private int id;
    private String title;
    private int imageId;
    private int price;

    public Product(int id, String title, int imageId, int price){
        this.id = id;
        this.title = title;
        this.imageId = imageId;
        this.price = price;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setImageId(int imageId){
        this.imageId = imageId;
    }

    public int getImageId(){
        return imageId;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
}
