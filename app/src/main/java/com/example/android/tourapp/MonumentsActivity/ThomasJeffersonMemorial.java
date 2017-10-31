package com.example.android.tourapp.MonumentsActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.android.tourapp.ItemPerList;
import com.example.android.tourapp.ItemPerListAdapter;
import com.example.android.tourapp.ParksActivity.MontroseParks;
import com.example.android.tourapp.R;
import com.example.android.tourapp.RestaurantsActivity.TokiUnderground;

import java.util.ArrayList;

public class ThomasJeffersonMemorial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thomas_jefferson_memorial);

        ArrayList<ItemPerList> jefferson = new ArrayList<>();
        jefferson.add(new ItemPerList(getString(R.string.TJ_Title)));
        jefferson.add(new ItemPerList(getString(R.string.TJ_Location)));
        jefferson.add(new ItemPerList(getString(R.string.TJ_Description)));

        ItemPerListAdapter itemAdapter = new ItemPerListAdapter(ThomasJeffersonMemorial.this, jefferson);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setDivider(null);

        listView.setAdapter(itemAdapter);
    }
}
