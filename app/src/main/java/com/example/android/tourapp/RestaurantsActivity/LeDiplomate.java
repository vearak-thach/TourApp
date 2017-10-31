package com.example.android.tourapp.RestaurantsActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.android.tourapp.ItemPerList;
import com.example.android.tourapp.ItemPerListAdapter;
import com.example.android.tourapp.R;

import java.util.ArrayList;

public class LeDiplomate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_le_diplomate);

        ArrayList<ItemPerList> leDiplomate = new ArrayList<>();
        leDiplomate.add(new ItemPerList(getString(R.string.Le_Diplomate_Title)));
        leDiplomate.add(new ItemPerList(getString(R.string.Le_Diplomate_Location)));
        leDiplomate.add(new ItemPerList(getString(R.string.Le_Diplomate_Description)));

        ItemPerListAdapter itemPerListAdapter = new ItemPerListAdapter(LeDiplomate.this, leDiplomate);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setDivider(null);

        listView.setAdapter(itemPerListAdapter);
    }
}
