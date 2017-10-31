package com.example.android.tourapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.tourapp.ParksActivity.CanalPark;
import com.example.android.tourapp.ParksActivity.LincolnPark;
import com.example.android.tourapp.ParksActivity.MitchellPark;
import com.example.android.tourapp.ParksActivity.MontroseParks;

import java.util.ArrayList;

public class Parks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parks);

        ArrayList<ItemPerList> parksList = new ArrayList<>();
        parksList.add(new ItemPerList(getString(R.string.Montrose_Title)));
        parksList.add(new ItemPerList(getString(R.string.Mitchell_Title)));
        parksList.add(new ItemPerList(getString(R.string.Canal_Title)));
        parksList.add(new ItemPerList(getString(R.string.Lincoln_Park_Title)));

        ItemPerListAdapter itemPerListAdapter = new ItemPerListAdapter(this, parksList);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemPerListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0: Intent newActivity2 = new Intent(Parks.this, MontroseParks.class);
                        startActivity(newActivity2);
                        break;
                    case 1: Intent newActivity3 = new Intent(Parks.this, MitchellPark.class);
                        startActivity(newActivity3);
                        break;
                    case 2: Intent newActivity5 = new Intent(Parks.this, CanalPark.class);
                        startActivity(newActivity5);
                        break;
                    case 3: Intent newActivity7 = new Intent(Parks.this, LincolnPark.class);
                        startActivity(newActivity7);
                        break;
                }
            }
        });
    }
}
