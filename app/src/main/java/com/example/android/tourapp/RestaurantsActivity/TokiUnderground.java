package com.example.android.tourapp.RestaurantsActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.android.tourapp.ItemPerList;
import com.example.android.tourapp.ItemPerListAdapter;
import com.example.android.tourapp.R;

import java.util.ArrayList;

public class TokiUnderground extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toki_underground);

        ArrayList<ItemPerList> tokiUnderground = new ArrayList<>();
        tokiUnderground.add(new ItemPerList(getString(R.string.Toki_Underground_Title)));
        tokiUnderground.add(new ItemPerList(getString(R.string.Toki_Underground_Location)));
        tokiUnderground.add(new ItemPerList(getString(R.string.Toki_Underground_Description)));

        ItemPerListAdapter itemPerListAdapter = new ItemPerListAdapter(TokiUnderground.this, tokiUnderground);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setDivider(null);

        listView.setAdapter(itemPerListAdapter);
    }
}
