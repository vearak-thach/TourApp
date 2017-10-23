package com.example.android.tourapp.ParksActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.android.tourapp.ItemPerList;
import com.example.android.tourapp.ItemPerListAdapter;
import com.example.android.tourapp.R;

import java.util.ArrayList;

import static android.os.Build.VERSION_CODES.M;

public class MitchellPark extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mitchell_park);

        ArrayList<ItemPerList> mitchell = new ArrayList<>();
        mitchell.add(new ItemPerList("Mitchell Park"));
        mitchell.add(new ItemPerList("23rd St NW & S St NW, Washington, DC 20008"));
        mitchell.add(new ItemPerList("A neighborhood park with a field & court for multiple sports, plus gardens & walking paths."));

        ItemPerListAdapter itemAdapter = new ItemPerListAdapter(MitchellPark.this, mitchell);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setDivider(null);

        listView.setAdapter(itemAdapter);
    }
}
