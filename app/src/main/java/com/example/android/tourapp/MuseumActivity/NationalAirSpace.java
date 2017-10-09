package com.example.android.tourapp.MuseumActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.example.android.tourapp.Item;
import com.example.android.tourapp.ItemAdapter;
import com.example.android.tourapp.ItemPerList;
import com.example.android.tourapp.ItemPerListAdapter;
import com.example.android.tourapp.R;

import java.util.ArrayList;

public class NationalAirSpace extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_national_air_space);

        ArrayList<Item> nationalAirSpaceInfo = new ArrayList<>();
        nationalAirSpaceInfo.add(new Item("National Air and Space Museum"));

        ItemAdapter itemAdapter = new ItemAdapter(this, nationalAirSpaceInfo);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemAdapter);

    }
}
