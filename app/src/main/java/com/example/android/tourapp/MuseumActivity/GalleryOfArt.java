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

        galleryOfArt.add(new ItemPerList("National Gallery of Art"));
        galleryOfArt.add(new ItemPerList("6th & Constitution Ave NW, Washington, DC 20565"));
        galleryOfArt.add(new ItemPerList("The National Gallery of Art open to the public contains " +
                "collection of paintings, drawings, prints, photographs, sculpture, medals, and decorative arts traces the development of Western Art from the Middle Ages to the present"));

        ItemPerListAdapter itemAdapter = new ItemPerListAdapter(GalleryOfArt.this, galleryOfArt);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setDivider(null);

        listView.setAdapter(itemAdapter);
    }
}
