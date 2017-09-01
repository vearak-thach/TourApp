package com.example.android.tourapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Set;

public class Museum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museum);

        //Create an array of Museums
        ArrayList<String> museumList = new ArrayList<>();
        museumList.add("National Air and Space Museum");
        museumList.add("National Gallery of Art");
        museumList.add("National Museum of African American History and Culture");
        museumList.add("National Gallery of Art - Sculpture Garden");
        museumList.add("United States Holocaust Memorial Museum");
        museumList.add("Newseum");
        museumList.add("Smithsonian National Museum of National History");
        museumList.add("The National Archives Museum");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, museumList);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

    }
}
