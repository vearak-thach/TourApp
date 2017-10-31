package com.example.android.tourapp.ParksActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.android.tourapp.ItemPerList;
import com.example.android.tourapp.ItemPerListAdapter;
import com.example.android.tourapp.R;

import java.util.ArrayList;


public class LincolnPark extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lincoln_park);

        ArrayList<ItemPerList> lincolnPark = new ArrayList<>();
        lincolnPark.add(new ItemPerList(getString(R.string.Lincoln_Park_Title)));
        lincolnPark.add(new ItemPerList(getString(R.string.Lincoln_Park_Location)));
        lincolnPark.add(new ItemPerList(getString(R.string.Lincoln_Park_Description)));

        ItemPerListAdapter itemAdapter = new ItemPerListAdapter(LincolnPark.this, lincolnPark);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setDivider(null);

        listView.setAdapter(itemAdapter);
    }
}
