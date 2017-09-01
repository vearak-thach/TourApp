package com.example.android.tourapp;

import android.support.annotation.Keep;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Restaurants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        //Create an Array of Restaurants
        ArrayList<String> restaurantsList = new ArrayList<>();
        restaurantsList.add("Le Dpiplomate");
        restaurantsList.add("Capital Grille");
        restaurantsList.add("Ssakuramen");
        restaurantsList.add("Toki Underground");
        restaurantsList.add("Busboys and Poets");
        restaurantsList.add("District Taco");
        restaurantsList.add("Mi Cuban Case");
        restaurantsList.add("Amsterdam Falafelshop");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, restaurantsList);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

    }
}
