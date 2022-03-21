package com.example.airapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterListAirport extends BaseAdapter {

    private Context context;
    private int layout;
    private List<AirPort> arrayListAirport;

    public AdapterListAirport(Context context, int layout, List<AirPort> arrayListAirport) {
        this.context = context;
        this.layout = layout;
        this.arrayListAirport = arrayListAirport;
    }

    @Override
    public int getCount() {
        return arrayListAirport.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        view = inflater.inflate(layout,null);

        AirPort itemAirport = arrayListAirport.get(i);

        TextView textViewAbbreviations = view.findViewById(R.id.abbreviations);
        TextView textViewNameProvinceOrCity = view.findViewById(R.id.nameProvinceOrCity);
        TextView textViewNameAirport = view.findViewById(R.id.nameAirport);

        textViewAbbreviations.setText(itemAirport.getAbbreviations());
        textViewNameProvinceOrCity.setText(itemAirport.getProvinceOrCity());
        textViewNameAirport.setText(itemAirport.getNameAirPort());

        return view;
    }
}
