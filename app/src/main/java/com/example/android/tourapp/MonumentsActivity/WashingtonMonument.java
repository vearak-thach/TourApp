package com.example.android.tourapp.MonumentsActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.android.tourapp.ItemPerList;
import com.example.android.tourapp.ItemPerListAdapter;
import com.example.android.tourapp.R;

import java.util.ArrayList;


public class WashingtonMonument extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_washington_monument);

        ArrayList<ItemPerList> washingtonMonument = new ArrayList<>();

        washingtonMonument.add(new ItemPerList(getString(R.string.Washington_Title)));
        washingtonMonument.add(new ItemPerList(getString(R.string.Washington_Location)));
        washingtonMonument.add(new ItemPerList(getString(R.string.Washington_Description)));
        washingtonMonument.add(new ItemPerList(R.drawable.washingtonmonument));
        ItemPerListAdapter itemAdapter = new ItemPerListAdapter(WashingtonMonument.this, washingtonMonument);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setDivider(null);

        listView.setAdapter(itemAdapter);
    }
}
