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
        canal.add(new ItemPerList("Canal Park"));
        canal.add(new ItemPerList("200 M St SE, Washington, DC 20003"));
        canal.add(new ItemPerList("Once a bus parking lot, this modern park now has interactive fountains, landscaping & a restaurant."));

        ItemPerListAdapter itemAdapter = new ItemPerListAdapter(CanalPark.this, canal);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setDivider(null);

        listView.setAdapter(itemAdapter);
    }
}
