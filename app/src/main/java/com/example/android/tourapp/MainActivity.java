package com.example.android.tourapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the View that shows the Museum category
        TextView museum = (TextView) findViewById(R.id.Museum);

        //Set a click listener on Museum view
        museum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent museumIntent = new Intent(MainActivity.this, Museum.class);
                startActivity(museumIntent);
            }
        });

        //Find the View that shows the Restaurants category
        TextView restaurants = (TextView) findViewById(R.id.Restaurants);

        //Set a click listener on Restaurants view
        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent restaurantsIntent = new Intent(MainActivity.this, Restaurants.class);
                startActivity(restaurantsIntent);
            }
        });

        //Find the View that shows the Parks category
        TextView parks = (TextView) findViewById(R.id.Parks);

        //Set a click listener on Parks view
        parks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent parksIntent = new Intent(MainActivity.this, Parks.class);
                startActivity(parksIntent);
            }
        });

        //Find the View that shows the Monuments category
        TextView monuments = (TextView) findViewById(R.id.Monuments);

        //Set a click listener on Monuments view
        monuments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent monumentsIntent = new Intent(MainActivity.this, Monuments.class);
                startActivity(monumentsIntent);
            }
        });

    }
}
