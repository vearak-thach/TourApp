package com.example.android.tourapp.MuseumActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.android.tourapp.ItemPerList;
import com.example.android.tourapp.ItemPerListAdapter;
import com.example.android.tourapp.R;

import java.util.ArrayList;


public class GalleryOfArt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_of_art);

        ArrayList<ItemPerList> galleryOfArt = new ArrayList<>();

        galleryOfArt.add(new ItemPerList(getString(R.string.NGA_Title)));
        galleryOfArt.add(new ItemPerList(getString(R.string.NGA_Location)));
        galleryOfArt.add(new ItemPerList(getString(R.string.NGA_Description)));

        ItemPerListAdapter itemAdapter = new ItemPerListAdapter(GalleryOfArt.this, galleryOfArt);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setDivider(null);

        listView.setAdapter(itemAdapter);
    }
}
