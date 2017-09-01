package com.example.android.tourapp;

import static android.os.Build.VERSION_CODES.N;

/**
 * Created by vearak.thach on 8/18/2017.
 */

public class Item {

    //Variable for list of items in Category
    private String mPlacesToVisit;
    private int mImageResourceID;

    //Get places to visit
    public String getmPlacesToVisit(){
        return mPlacesToVisit;
    }

    //Get the image view for the item
    public int getmImageResourceID(){
        return mImageResourceID;
    }

    @Override
    public String toString(){
        return "Places to visit: " + mPlacesToVisit + '\'' + " Image: " + mImageResourceID;
    }

}
