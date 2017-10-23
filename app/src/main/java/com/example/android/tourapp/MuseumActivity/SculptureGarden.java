package com.example.android.tourapp.MuseumActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.android.tourapp.ItemPerList;
import com.example.android.tourapp.ItemPerListAdapter;
import com.example.android.tourapp.R;

import java.util.ArrayList;

public class SculptureGarden extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sculpture_garden);

        ArrayList<ItemPerList> sculptureGarden = new ArrayList<>();
        sculptureGarden.add(new ItemPerList("National Gallery of Art - Sculpture Garden"));
        sculptureGarden.add(new ItemPerList("Constitution Ave NW & 7th Street, Washington, DC 20408"));
        sculptureGarden.add(new ItemPerList("A recent addition to the National Gallery of Art. " +
                "It is located on the National Mall between the National Gallery's West Building and the Smithsonian Institution's National Museum of Natural History."));
        ItemPerListAdapter itemAdapter = new ItemPerListAdapter(SculptureGarden.this, sculptureGarden);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setDivider(null);

        listView.setAdapter(itemAdapter);

    }
}
