package com.example.android.tourapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.example.android.tourapp.MonumentsActivity.FranklinDelanoRooseveltMemorial;
import com.example.android.tourapp.MonumentsActivity.KoreanWarVeteransMemorial;
import com.example.android.tourapp.MonumentsActivity.LincolnMemorial;
import com.example.android.tourapp.MonumentsActivity.MartinLutherKingJrMemorial;
import com.example.android.tourapp.MonumentsActivity.ThomasJeffersonMemorial;
import com.example.android.tourapp.MonumentsActivity.VietnamVeteransMemorial;
import com.example.android.tourapp.MonumentsActivity.WashingtonMonument;
import com.example.android.tourapp.MonumentsActivity.WorldWarIIMemorial;

import java.util.ArrayList;

public class Monuments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monuments);

        ArrayList<ItemPerList> monumentsList = new ArrayList<>();
        monumentsList.add(new ItemPerList("Washington Monument"));
        monumentsList.add(new ItemPerList("Lincoln Memorial"));
        monumentsList.add(new ItemPerList("Thomas Jefferson Memorial"));
        monumentsList.add(new ItemPerList("Franklin Delano Roosevelt Memorial"));
        monumentsList.add(new ItemPerList("Korean War Veterans Memorial"));
        monumentsList.add(new ItemPerList("Vietnam Veterans Memorial"));
        monumentsList.add(new ItemPerList("Martin Luther King Jr Memorial"));
        monumentsList.add(new ItemPerList("World War II Memorial"));

        ItemsAdapter itemsAdapter = new ItemsAdapter(this, monumentsList);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0: Intent newActivity1 = new Intent(Monuments.this, WashingtonMonument.class);
                        startActivity(newActivity1);
                        break;
                    case 1: Intent newActivity2 = new Intent(Monuments.this, LincolnMemorial.class);
                        startActivity(newActivity2);
                        break;
                    case 2: Intent newActivity3 = new Intent(Monuments.this, ThomasJeffersonMemorial.class);
                        startActivity(newActivity3);
                        break;
                    case 3: Intent newActivity4 = new Intent(Monuments.this, FranklinDelanoRooseveltMemorial.class);
                        startActivity(newActivity4);
                        break;
                    case 4: Intent newActivity5 = new Intent(Monuments.this, KoreanWarVeteransMemorial.class);
                        startActivity(newActivity5);
                        break;
                    case 5: Intent newActivity6 = new Intent(Monuments.this, VietnamVeteransMemorial.class);
                        startActivity(newActivity6);
                        break;
                    case 6: Intent newActivity7 = new Intent(Monuments.this, MartinLutherKingJrMemorial.class);
                        startActivity(newActivity7);
                        break;
                    case 7: Intent newActivity8 = new Intent(Monuments.this, WorldWarIIMemorial.class);
                        startActivity(newActivity8);
                        break;
                }
            }
        });
    }
}
