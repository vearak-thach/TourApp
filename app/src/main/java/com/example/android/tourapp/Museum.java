package com.example.android.tourapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.tourapp.MuseumActivity.AfricanAmericanHistory;
import com.example.android.tourapp.MuseumActivity.GalleryOfArt;
import com.example.android.tourapp.MuseumActivity.HolocaustMemorialMuseum;
import com.example.android.tourapp.MuseumActivity.NationalAirSpace;
import com.example.android.tourapp.MuseumActivity.NationalArchive;
import com.example.android.tourapp.MuseumActivity.Newseum;
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
        museumList.add(new ItemPerList("National Museum of African American History and Culture"));
        museumList.add(new ItemPerList("National Gallery of Art - Sculpture Garden"));
        museumList.add(new ItemPerList("United States Holocaust Memorial Museum"));
        museumList.add(new ItemPerList("Newseum"));
        museumList.add(new ItemPerList("Smithsonian National Museum of National History"));
        museumList.add(new ItemPerList("The National Archives Museum"));

        ItemsAdapter itemsAdapter = new ItemsAdapter(this, museumList);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);


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
                    case 2: Intent newActivity3 = new Intent(Museum.this, AfricanAmericanHistory.class);
                        startActivity(newActivity3);
                        break;
                    case 3: Intent newActivity4 = new Intent(Museum.this, SculptureGarden.class);
                        startActivity(newActivity4);
                        break;
                    case 4: Intent newActivity5 = new Intent(Museum.this, HolocaustMemorialMuseum.class);
                        startActivity(newActivity5);
                        break;
                    case 5: Intent newActivity6 = new Intent(Museum.this, Newseum.class);
                        startActivity(newActivity6);
                        break;
                    case 6: Intent newActivity7 = new Intent(Museum.this, SmithsonianNationalHistory.class);
                        startActivity(newActivity7);
                        break;
                    case 7: Intent newactivity8 = new Intent(Museum.this, NationalArchive.class);
                        startActivity(newactivity8);
                        break;
                }
            }
        });
    }
}
