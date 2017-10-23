package com.example.android.tourapp.MuseumActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.android.tourapp.ItemPerList;
import com.example.android.tourapp.ItemPerListAdapter;
import com.example.android.tourapp.R;

import java.util.ArrayList;

public class SmithsonianNationalHistory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smithsonian_national_history);

        ArrayList<ItemPerList> nationalHistory = new ArrayList<>();
        nationalHistory.add(new ItemPerList("Smithsonian National Museum of Natural History"));
        nationalHistory.add(new ItemPerList("10th St. & Constitution Ave. NW, Washington, DC 20560"));
        nationalHistory.add(new ItemPerList("Located near the National Mall, the National History Museum shows " +
                "collections contain over 126 million specimens of plants, animals, fossils, minerals, rocks, meteorites, human remains, and human cultural artifacts."));
        ItemPerListAdapter itemAdapter = new ItemPerListAdapter(SmithsonianNationalHistory.this, nationalHistory);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setDivider(null);

        listView.setAdapter(itemAdapter);
    }
}
