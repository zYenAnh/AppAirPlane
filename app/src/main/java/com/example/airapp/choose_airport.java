package com.example.airapp;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class choose_airport extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_airport);

        ListView listViewAirport;
        ArrayList<AirPort> arrayListAirport;
        AdapterListAirport adapterAirport;

        arrayListAirport = new ArrayList<>();

        listViewAirport = findViewById(R.id.listViewAirport);

        arrayListAirport.add(new AirPort(1,"HAN","Hà Nội","Sân bay quốc tế Nội Bài"));
        adapterAirport = new AdapterListAirport(getBaseContext(),R.layout.layout_tickets,arrayListAirport);
        listViewAirport.setAdapter(adapterAirport);
    }

}