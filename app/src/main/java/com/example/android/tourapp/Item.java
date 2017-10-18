package com.example.android.tourapp;

import static android.os.Build.VERSION_CODES.N;

/**
 * Created by vearak.thach on 8/18/2017.
 */

public class Item {

    //Variable for list of items in Category
    private String itemName;
    private String itemLocation;
    private String itemDescription;

     public Item(String itemName, String itemLocation, String itemDescription){
         this.itemName = itemName;
         this.itemLocation = itemLocation;
         this.itemDescription = itemDescription;
     }

     public String getItemName(){
         return itemName;
     }

     public String getItemLocation(){
         return itemLocation;
     }

     public String getItemDescription(){
         return itemDescription;
     }

}
