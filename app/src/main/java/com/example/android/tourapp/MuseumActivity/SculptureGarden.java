package com.example.android.tourapp.MuseumActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.android.tourapp.ItemPerList;
import com.example.android.tourapp.ItemPerListAdapter;
import com.example.android.tourapp.Museum;
import com.example.android.tourapp.R;

import java.util.ArrayList;

public class SculptureGarden extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sculpture_garden);

        ArrayList<ItemPerList> sculptureGarden = new ArrayList<>();
        sculptureGarden.add(new ItemPerList(getString(R.string.Sculpture_Garden_Title)));
        sculptureGarden.add(new ItemPerList(getString(R.string.Sculpture_Garden_Location)));
        sculptureGarden.add(new ItemPerList(getString(R.string.Sculpture_Garden_Description)));
        ItemPerListAdapter itemAdapter = new ItemPerListAdapter(SculptureGarden.this, sculptureGarden);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setDivider(null);

        listView.setAdapter(itemAdapter);

    }
}
