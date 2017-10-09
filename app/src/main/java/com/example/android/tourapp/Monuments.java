package com.example.android.tourapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.tourapp.MonumentsActivity.FranklinDelanoRooseveltMemorial;
import com.example.android.tourapp.MonumentsActivity.LincolnMemorial;
import com.example.android.tourapp.MonumentsActivity.ThomasJeffersonMemorial;
import com.example.android.tourapp.MonumentsActivity.WashingtonMonument;

import java.util.ArrayList;

public class Monuments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monuments);

        ArrayList<ItemPerList> monumentsList = new ArrayList<>();
        monumentsList.add(new ItemPerList("Washington Monument"));
        monumentsList.add(new ItemPerList("Lincoln Memorial"));
        monumentsList.add(new ItemPerList("Thomas Jefferson Memorial"));
        monumentsList.add(new ItemPerList("Franklin Delano Roosevelt Memorial"));

        ItemPerListAdapter itemPerListAdapter = new ItemPerListAdapter(this, monumentsList);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemPerListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0: Intent newActivity1 = new Intent(Monuments.this, WashingtonMonument.class);
                        startActivity(newActivity1);
                        break;
                    case 1: Intent newActivity2 = new Intent(Monuments.this, LincolnMemorial.class);
                        startActivity(newActivity2);
                        break;
                    case 2: Intent newActivity3 = new Intent(Monuments.this, ThomasJeffersonMemorial.class);
                        startActivity(newActivity3);
                        break;
                    case 3: Intent newActivity4 = new Intent(Monuments.this, FranklinDelanoRooseveltMemorial.class);
                        startActivity(newActivity4);
                        break;
                }
            }
        });
    }
}
