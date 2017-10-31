package com.example.android.tourapp.MonumentsActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.android.tourapp.ItemPerList;
import com.example.android.tourapp.ItemPerListAdapter;
import com.example.android.tourapp.ParksActivity.MontroseParks;
import com.example.android.tourapp.R;

import java.util.ArrayList;

public class LincolnMemorial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lincoln_memorial);

        ArrayList<ItemPerList> lincolnMemorial = new ArrayList<>();
        lincolnMemorial.add(new ItemPerList(getString(R.string.Lincoln_Title)));
        lincolnMemorial.add(new ItemPerList(getString(R.string.Lincoln_Location)));
        lincolnMemorial.add(new ItemPerList(getString(R.string.Lincoln_Description)));

        ItemPerListAdapter itemAdapter = new ItemPerListAdapter(LincolnMemorial.this, lincolnMemorial);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setDivider(null);

        listView.setAdapter(itemAdapter);
    }
}
