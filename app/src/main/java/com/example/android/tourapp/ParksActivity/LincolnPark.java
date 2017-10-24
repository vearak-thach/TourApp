package com.example.android.tourapp.ParksActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.android.tourapp.ItemPerList;
import com.example.android.tourapp.ItemPerListAdapter;
import com.example.android.tourapp.R;

import java.util.ArrayList;


public class LincolnPark extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lincoln_park);

        ArrayList<ItemPerList> lincolnPark = new ArrayList<>();
        lincolnPark.add(new ItemPerList("Lincoln Park"));
        lincolnPark.add(new ItemPerList("Washington, DC 20003"));
        lincolnPark.add(new ItemPerList("Lincoln Park is an urban park located in the Capitol Hill neighborhood of Washington, D.C. "));

        ItemPerListAdapter itemAdapter = new ItemPerListAdapter(LincolnPark.this, lincolnPark);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setDivider(null);

        listView.setAdapter(itemAdapter);
    }
}
