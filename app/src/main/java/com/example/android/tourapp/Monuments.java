package com.example.android.tourapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Monuments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monuments);

        ArrayList<String> monumentsList = new ArrayList<>();
        monumentsList.add("Washington Monument");
        monumentsList.add("Lincoln Memorial");
        monumentsList.add("Thomas Jefferson Memorial");
        monumentsList.add("Franklin Delano Roosevelt Memorial");
        monumentsList.add("Korean War Veterans Memorial");
        monumentsList.add("Vietnam Veterans Memorial");
        monumentsList.add("Martin Luther King Jr Memorial");
        monumentsList.add("World War II Memorial");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, monumentsList);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
