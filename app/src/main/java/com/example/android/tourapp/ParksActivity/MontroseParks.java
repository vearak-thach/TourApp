package com.example.android.tourapp.ParksActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.android.tourapp.ItemPerList;
import com.example.android.tourapp.ItemPerListAdapter;
import com.example.android.tourapp.R;

import java.util.ArrayList;

public class MontroseParks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_montrose_parks);

        ArrayList<ItemPerList> montrose = new ArrayList<>();
        montrose.add(new ItemPerList(getString(R.string.Montrose_Title)));
        montrose.add(new ItemPerList(getString(R.string.Montrose_Location)));
        montrose.add(new ItemPerList(getString(R.string.Montrose_Description)));

        ItemPerListAdapter itemAdapter = new ItemPerListAdapter(MontroseParks.this, montrose);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setDivider(null);

        listView.setAdapter(itemAdapter);
    }
}
