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
        arrayListAirport.add(new AirPort(2,"BMV","Buôn Mê Thuột","Sân bay quốc nội Buôn Mê Thuột"));
        arrayListAirport.add(new AirPort(3,"SGN","Hồ Chí Minh","Sân bay quốc tế Tân Sơn Nhất"));
        arrayListAirport.add(new AirPort(4,"DNA","Đà Nẵng","Sân bay Đà Nẵng"));
        adapterAirport = new AdapterListAirport(getBaseContext(),R.layout.layout_airport,arrayListAirport);
        listViewAirport.setAdapter(adapterAirport);
    }

}