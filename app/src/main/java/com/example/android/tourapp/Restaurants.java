package com.example.android.tourapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.tourapp.RestaurantsActivity.AmsterdamFalafelshop;
import com.example.android.tourapp.RestaurantsActivity.BusboysAndPoets;
import com.example.android.tourapp.RestaurantsActivity.CapitalGrille;
import com.example.android.tourapp.RestaurantsActivity.DistrictTaco;
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
        restaurantsList.add(new ItemPerList("Le Diplomate"));
        restaurantsList.add(new ItemPerList("Capital Grille"));
        restaurantsList.add(new ItemPerList("Sakuramen"));
        restaurantsList.add(new ItemPerList("Toki Underground"));
        restaurantsList.add(new ItemPerList("Busboys and Poets"));
        restaurantsList.add(new ItemPerList("District Taco"));
        restaurantsList.add(new ItemPerList("Mi Cuban Case"));
        restaurantsList.add(new ItemPerList("Amsterdam Falafelshop"));

        ItemsAdapter itemsAdapter = new ItemsAdapter(this, restaurantsList);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0: Intent newActivity1 = new Intent(Restaurants.this, LeDiplomate.class);
                        startActivity(newActivity1);
                        break;
                    case 1: Intent newActivity2 = new Intent(Restaurants.this, CapitalGrille.class);
                        startActivity(newActivity2);
                        break;
                    case 2: Intent newActivity3 = new Intent(Restaurants.this, Sakuramen.class);
                        startActivity(newActivity3);
                        break;
                    case 3: Intent newActivity4 = new Intent(Restaurants.this, TokiUnderground.class);
                        startActivity(newActivity4);
                        break;
                    case 4: Intent newActivity5 = new Intent(Restaurants.this, BusboysAndPoets.class);
                        startActivity(newActivity5);
                        break;
                    case 5: Intent newActivity6 = new Intent(Restaurants.this, DistrictTaco.class);
                        startActivity(newActivity6);
                        break;
                    case 6: Intent newActivity7 = new Intent(Restaurants.this, MiCubanCase.class);
                        startActivity(newActivity7);
                        break;
                    case 7: Intent newActivity8 = new Intent(Restaurants.this, AmsterdamFalafelshop.class);
                        startActivity(newActivity8);
                        break;
                }
            }
        });

    }
}
