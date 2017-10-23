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
        lincolnMemorial.add(new ItemPerList("Lincoln Memorial"));
        lincolnMemorial.add(new ItemPerList("2 Lincoln Memorial Cir NW, Washington, DC 20037"));
        lincolnMemorial.add(new ItemPerList("The Lincoln Memorial is an American national monument built to honor " +
                "the 16th President of the United States, Abraham Lincoln."));

        ItemPerListAdapter itemAdapter = new ItemPerListAdapter(LincolnMemorial.this, lincolnMemorial);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setDivider(null);

        listView.setAdapter(itemAdapter);
    }
}
