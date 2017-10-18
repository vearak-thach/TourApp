package com.example.android.tourapp;

/**
 * Created by vearak.thach on 9/8/2017.
 */

public class ItemPerList {
    private String itemText;
    private int itemImage;

    public  ItemPerList(String itemText){
        this.itemText = itemText;
    }
    public ItemPerList(int itemImage){this.itemImage = itemImage;}

    public String getItemText(){
        return itemText;
    }


    public int getItemImage(){return  itemImage;}
}
