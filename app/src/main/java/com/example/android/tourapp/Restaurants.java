package com.example.android.tourapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.tourapp.RestaurantsActivity.LeDiplomate;
import com.example.android.tourapp.RestaurantsActivity.MiCubanCase;
import com.example.android.tourapp.RestaurantsActivity.Sakuramen;
import com.example.android.tourapp.RestaurantsActivity.TokiUnderground;

import java.util.ArrayList;

public class Restaurants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        //Create an Array of Restaurants
        ArrayList<ItemPerList> restaurantsList = new ArrayList<>();
        restaurantsList.add(new ItemPerList(getString(R.string.Le_Diplomate_Title)));
        restaurantsList.add(new ItemPerList(getString(R.string.Sakuramen_Title)));
        restaurantsList.add(new ItemPerList(getString(R.string.Toki_Underground_Title)));
        restaurantsList.add(new ItemPerList(getString(R.string.Mi_Cuban_Case_Title)));

        ItemPerListAdapter itemPerListAdapter = new ItemPerListAdapter(this, restaurantsList);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemPerListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0: Intent newActivity1 = new Intent(Restaurants.this, LeDiplomate.class);
                        startActivity(newActivity1);
                        break;
                    case 1: Intent newActivity3 = new Intent(Restaurants.this, Sakuramen.class);
                        startActivity(newActivity3);
                        break;
                    case 2: Intent newActivity4 = new Intent(Restaurants.this, TokiUnderground.class);
                        startActivity(newActivity4);
                        break;
                    case 3: Intent newActivity7 = new Intent(Restaurants.this, MiCubanCase.class);
                        startActivity(newActivity7);
                        break;
                }
            }
        });

    }
}
