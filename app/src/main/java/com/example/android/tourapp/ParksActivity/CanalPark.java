package com.example.android.tourapp.ParksActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.android.tourapp.ItemPerList;
import com.example.android.tourapp.ItemPerListAdapter;
import com.example.android.tourapp.R;

import java.util.ArrayList;

public class CanalPark extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canal_park);

        ArrayList<ItemPerList> canal = new ArrayList<>();
        canal.add(new ItemPerList(getString(R.string.Canal_Title)));
        canal.add(new ItemPerList(getString(R.string.Canal_Location)));
        canal.add(new ItemPerList(getString(R.string.Canal_Description)));

        ItemPerListAdapter itemAdapter = new ItemPerListAdapter(CanalPark.this, canal);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setDivider(null);

        listView.setAdapter(itemAdapter);
    }
}
