package com.example.android.tourapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.tourapp.MuseumActivity.GalleryOfArt;
import com.example.android.tourapp.MuseumActivity.NationalAirSpace;
import com.example.android.tourapp.MuseumActivity.SculptureGarden;
import com.example.android.tourapp.MuseumActivity.SmithsonianNationalHistory;

import java.util.ArrayList;

public class Museum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museum);

        //Create an array of Museums
        final ArrayList<ItemPerList> museumList = new ArrayList<>();
        museumList.add(new ItemPerList("National Air and Space Museum"));
        museumList.add(new ItemPerList("National Gallery of Art"));
        museumList.add(new ItemPerList("National Gallery of Art - Sculpture Garden"));
        museumList.add(new ItemPerList("Smithsonian National Museum of National History"));

        ItemPerListAdapter itemPerListAdapter = new ItemPerListAdapter(this, museumList);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemPerListAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position)
                {
                    case 0: Intent newActivity0 = new Intent(Museum.this, NationalAirSpace.class);
                        startActivity(newActivity0);
                        break;
                    case 1: Intent newActivity1 = new Intent(Museum.this, GalleryOfArt.class);
                        startActivity(newActivity1);
                        break;
                    case 2: Intent newActivity4 = new Intent(Museum.this, SculptureGarden.class);
                        startActivity(newActivity4);
                        break;
                    case 3: Intent newActivity7 = new Intent(Museum.this, SmithsonianNationalHistory.class);
                        startActivity(newActivity7);
                        break;
                }
            }
        });
    }
}
