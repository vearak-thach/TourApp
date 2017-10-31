package com.example.android.tourapp.ParksActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.android.tourapp.ItemPerList;
import com.example.android.tourapp.ItemPerListAdapter;
import com.example.android.tourapp.R;

import java.util.ArrayList;


public class MitchellPark extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mitchell_park);

        ArrayList<ItemPerList> mitchell = new ArrayList<>();
        mitchell.add(new ItemPerList(getString(R.string.Mitchell_Title)));
        mitchell.add(new ItemPerList(getString(R.string.Mitchell_Location)));
        mitchell.add(new ItemPerList(getString(R.string.Mitchell_Description)));

        ItemPerListAdapter itemAdapter = new ItemPerListAdapter(MitchellPark.this, mitchell);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setDivider(null);

        listView.setAdapter(itemAdapter);
    }
}
