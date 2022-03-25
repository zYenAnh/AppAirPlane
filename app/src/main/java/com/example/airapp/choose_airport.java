package com.example.airapp;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class choose_airport extends AppCompatActivity {

    private ListView listViewAirport;
    private ArrayList<AirPort> arrayListAirport;
    private AdapterListAirport adapterAirport;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_airport);

        arrayListAirport = new ArrayList<>();

        listViewAirport = findViewById(R.id.listViewAirport);

        arrayListAirport.add(new AirPort(1,"HAN","Hà Nội","Sân bay quốc tế Nội Bài"));
        arrayListAirport.add(new AirPort(2,"BMV","Buôn Mê Thuột","Sân bay quốc nội Buôn Mê Thuột"));
        arrayListAirport.add(new AirPort(3,"SGN","Hồ Chí Minh","Sân bay quốc tế Tân Sơn Nhất"));
        arrayListAirport.add(new AirPort(4,"DNA","Đà Nẵng","Sân bay Đà Nẵng"));
        arrayListAirport.add(new AirPort(5,"VCA","Cần Thơ","Sân bay Cần Thơ"));
        arrayListAirport.add(new AirPort(6,"DIN","Điện Biên Phủ","Sân bay Điện Biên Phủ"));
        arrayListAirport.add(new AirPort(7,"VII","Nghệ An","Sân bay Vinh"));
        arrayListAirport.add(new AirPort(8,"HPH","Hải Phòng","Sân bay Hải Phòng"));
        arrayListAirport.add(new AirPort(9,"PXU","Gia Lai","Sân bay Pleiku"));
        arrayListAirport.add(new AirPort(10,"VCS","Vũng Tàu","Sân bay Côn Đảo"));
        arrayListAirport.add(new AirPort(11,"PQC","Kiên Giang","Sân bay Phú Quốc"));
        adapterAirport = new AdapterListAirport(getBaseContext(),R.layout.layout_airport,arrayListAirport);
        listViewAirport.setAdapter(adapterAirport);

        listViewAirport.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent data = new Intent();
                        saveDataToIntent(data,i);
                        finish();
                }
        });
    }

    public void saveDataToIntent(Intent i,int index){
        String abbreviations = arrayListAirport.get(index).getAbbreviations();
        String provinceCity = arrayListAirport.get(index).getProvinceOrCity();
        i.putExtra("IDAirport",abbreviations);
        i.putExtra("ProvinceCity",provinceCity);
        setResult(RESULT_OK,i);
    }
}