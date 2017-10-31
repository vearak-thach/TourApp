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

        nationalAirSpace.add(new ItemPerList(getString(R.string.Air_Space_Title)));
        nationalAirSpace.add(new ItemPerList(getString(R.string.Air_Space_Location)));
        nationalAirSpace.add(new ItemPerList(getString(R.string.Air_Space_Description)));
        nationalAirSpace.add(new ItemPerList(R.drawable.airspace));

        ItemPerListAdapter itemAdapter = new ItemPerListAdapter(NationalAirSpace.this, nationalAirSpace);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setDivider(null);

        listView.setAdapter(itemAdapter);
    }
}
