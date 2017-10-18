package com.example.android.tourapp.MuseumActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.android.tourapp.ItemPerList;
import com.example.android.tourapp.ItemPerListAdapter;
import com.example.android.tourapp.R;

import java.util.ArrayList;

public class NationalAirSpace extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_national_air_space);

        ArrayList<ItemPerList> nationalAirSpace = new ArrayList<>();

        nationalAirSpace.add(new ItemPerList("National Air and Space Museum"));
        nationalAirSpace.add(new ItemPerList("600 Independence Ave SW, Washington, DC 20560"));
        nationalAirSpace.add(new ItemPerList("The National Air and Space Museum has the largest collection of historic aircraft and spacecraft. Established in 1946, it officially opened it's main building on the National Mall in 1976." +
                "The National Air and Space Museum is the center for research into the history and science of aviation."));
        nationalAirSpace.add(new ItemPerList(R.drawable.airspace));
        ItemPerListAdapter itemAdapter = new ItemPerListAdapter(NationalAirSpace.this, nationalAirSpace);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setDivider(null);

        listView.setAdapter(itemAdapter);
    }
}
