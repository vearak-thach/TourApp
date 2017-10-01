package com.example.android.tourapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.example.android.tourapp.ParksActivity.BatteryKemblePark;
import com.example.android.tourapp.ParksActivity.CanalPark;
import com.example.android.tourapp.ParksActivity.CrispusAttucksPark;
import com.example.android.tourapp.ParksActivity.LincolnPark;
import com.example.android.tourapp.ParksActivity.MeridianHillPark;
import com.example.android.tourapp.ParksActivity.MitchellPark;
import com.example.android.tourapp.ParksActivity.MontroseParks;
import com.example.android.tourapp.ParksActivity.TurtlePark;

import java.util.ArrayList;

public class Parks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parks);

        ArrayList<ItemPerList> parksList = new ArrayList<>();
        parksList.add(new ItemPerList("Meridian Hill Park"));
        parksList.add(new ItemPerList("Montrose Parks"));
        parksList.add(new ItemPerList("Mitchell Park"));
        parksList.add(new ItemPerList("Battery Kemble Park"));
        parksList.add(new ItemPerList("Canal Park"));
        parksList.add(new ItemPerList("Crispus Attucks Park"));
        parksList.add(new ItemPerList("Lincoln Park"));
        parksList.add(new ItemPerList("Turtle Park"));

        ItemsAdapter itemsAdapter = new ItemsAdapter(this, parksList);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0: Intent newActivity1 = new Intent(Parks.this, MeridianHillPark.class);
                        startActivity(newActivity1);
                        break;
                    case 1: Intent newActivity2 = new Intent(Parks.this, MontroseParks.class);
                        startActivity(newActivity2);
                        break;
                    case 2: Intent newActivity3 = new Intent(Parks.this, MitchellPark.class);
                        startActivity(newActivity3);
                        break;
                    case 3: Intent newActivity4 = new Intent(Parks.this, BatteryKemblePark.class);
                        startActivity(newActivity4);
                        break;
                    case 4: Intent newActivity5 = new Intent(Parks.this, CanalPark.class);
                        startActivity(newActivity5);
                        break;
                    case 5: Intent newActivity6 = new Intent(Parks.this, CrispusAttucksPark.class);
                        startActivity(newActivity6);
                        break;
                    case 6: Intent newActivity7 = new Intent(Parks.this, LincolnPark.class);
                        startActivity(newActivity7);
                        break;
                    case 7: Intent newActivity8 = new Intent(Parks.this, TurtlePark.class);
                        startActivity(newActivity8);
                        break;
                }
            }
        });
    }
}
