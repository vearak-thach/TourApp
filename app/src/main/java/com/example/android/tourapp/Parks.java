package com.example.android.tourapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Parks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parks);

        ArrayList<String> parksList = new ArrayList<>();
        parksList.add("Meridian Hill Park");
        parksList.add("Montrose Parks");
        parksList.add("Mitchell Park");
        parksList.add("Battery Kemble Park");
        parksList.add("Canal Park");
        parksList.add("Crispus Attucks Park");
        parksList.add("Lincoln Park");
        parksList.add("Turtle Park");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, parksList);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
