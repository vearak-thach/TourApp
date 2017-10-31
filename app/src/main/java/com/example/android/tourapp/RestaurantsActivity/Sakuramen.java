package com.example.android.tourapp.RestaurantsActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.android.tourapp.ItemPerList;
import com.example.android.tourapp.ItemPerListAdapter;
import com.example.android.tourapp.R;

import java.util.ArrayList;

public class Sakuramen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sakuramen);

        ArrayList<ItemPerList> sakuramen = new ArrayList<>();
        sakuramen.add(new ItemPerList(getString(R.string.Sakuramen_Title)));
        sakuramen.add(new ItemPerList(getString(R.string.Sakuramen_Location)));
        sakuramen.add(new ItemPerList(getString(R.string.Sakuramen_Description)));

        ItemPerListAdapter itemPerListAdapter = new ItemPerListAdapter(Sakuramen.this, sakuramen);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setDivider(null);

        listView.setAdapter(itemPerListAdapter);
    }
}
