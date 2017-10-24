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
        montrose.add(new ItemPerList("Montrose Park"));
        montrose.add(new ItemPerList("Washington, DC 20007"));
        montrose.add(new ItemPerList("16 acre park built in 1911."));

        ItemPerListAdapter itemAdapter = new ItemPerListAdapter(MontroseParks.this, montrose);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setDivider(null);

        listView.setAdapter(itemAdapter);
    }
}
