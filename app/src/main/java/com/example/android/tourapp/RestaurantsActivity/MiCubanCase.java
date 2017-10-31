package com.example.android.tourapp.RestaurantsActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.android.tourapp.ItemPerList;
import com.example.android.tourapp.ItemPerListAdapter;
import com.example.android.tourapp.R;

import java.util.ArrayList;

public class MiCubanCase extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_cuban_case);

        ArrayList<ItemPerList> miCubanCase = new ArrayList<>();
        miCubanCase.add(new ItemPerList(getString(R.string.Mi_Cuban_Case_Title)));
        miCubanCase.add(new ItemPerList(getString(R.string.Mi_Cuban_Case_Location)));
        miCubanCase.add(new ItemPerList(getString(R.string.Mi_Cuban_Case_Description)));

        ItemPerListAdapter itemPerListAdapter = new ItemPerListAdapter(MiCubanCase.this, miCubanCase);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setDivider(null);

        listView.setAdapter(itemPerListAdapter);
    }
}
