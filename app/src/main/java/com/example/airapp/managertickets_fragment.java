package com.example.airapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class managertickets_fragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_managertickets_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ListView listViewTickets;
        ArrayList<FlightTicket> arrayListTickets;
        AdapterTickets adapterTickets;

        arrayListTickets = new ArrayList<>();

        listViewTickets = view.findViewById(R.id.ListViewTickets);
        arrayListTickets.add(new FlightTicket(1,"30/2/2022","05:00",
                    "07:10","HAN","SGN","Bay thẳng",1276000,
                    "VietNamAirlines","Phổ thông giá rẻ",R.drawable.vietnamairliness_ic,true,R.drawable.tick_ic));
        arrayListTickets.add(new FlightTicket(1,"17/06/2021","05:00",
                    "07:10","HAN","SGN","Bay thẳng",1276000,
                    "VietNamAirlines","Phổ thông giá rẻ",R.drawable.vietnamairliness_ic,true,R.drawable.tick_ic));
        arrayListTickets.add(new FlightTicket(1,"17/06/2021","05:00",
                "07:10","HAN","SGN","Bay thẳng",1276000,
                "VietNamAirlines","Phổ thông giá rẻ",R.drawable.vietnamairliness_ic,true,R.drawable.tick_ic));
        arrayListTickets.add(new FlightTicket(1,"17/06/2021","05:00",
                "07:10","HAN","SGN","Bay thẳng",1276000,
                "VietNamAirlines","Phổ thông giá rẻ",R.drawable.vietnamairliness_ic,true,R.drawable.tick_ic));

        adapterTickets = new AdapterTickets(getContext(),R.layout.layout_tickets,arrayListTickets);
        listViewTickets.setAdapter(adapterTickets);

    }
}

