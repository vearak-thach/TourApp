package com.example.android.tourapp.MonumentsActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.example.android.tourapp.ItemPerList;
import com.example.android.tourapp.ItemPerListAdapter;
import com.example.android.tourapp.ParksActivity.MontroseParks;
import com.example.android.tourapp.R;

import java.util.ArrayList;

import static android.os.Build.VERSION_CODES.M;

public class FranklinDelanoRooseveltMemorial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_franklin_delano_roosevelt_memorial);

        ArrayList<ItemPerList> roosevelt = new ArrayList<>();
        roosevelt.add(new ItemPerList(getString(R.string.FDR_Title)));
        roosevelt.add(new ItemPerList(getString(R.string.FDR_Location)));
        roosevelt.add(new ItemPerList(getString(R.string.FDR_Description)));

        ItemPerListAdapter itemAdapter = new ItemPerListAdapter(FranklinDelanoRooseveltMemorial.this, roosevelt);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setDivider(null);

        listView.setAdapter(itemAdapter);

    }
}
