package com.example.airapp;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class booktickets_fragment extends Fragment implements View.OnClickListener {

    private Button callFragment1;
    private Button callFragment2;
    private ImageView swap_location;
    private TextView start_location;
    private TextView end_location;
    private String str_start;
    private String str_end;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_booktickets_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view,savedInstanceState);

        // set Values
        callFragment1 = (Button)view.findViewById(R.id.btn_bydate) ;
        callFragment2 = (Button)view.findViewById(R.id.btn_bymonth);
        swap_location = (ImageView)view.findViewById(R.id.swap_location);
        start_location = (TextView)view.findViewById(R.id.start_location_text);
        end_location = (TextView)view.findViewById(R.id.end_location_text);

        // callFunction
        getChildFragmentManager().beginTransaction().replace(R.id.home_framelayout, new home_child_fragment1()).commit();
        callFragment1.setOnClickListener(this);
        callFragment2.setOnClickListener(this);
        swap_location.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.swap_location) {
            str_start = start_location.getText().toString();
            str_end = end_location.getText().toString();
            String temp = str_start;
            str_start=str_end;
            str_end=temp;
            start_location.setText(str_start);
            end_location.setText(str_end);
        }
        if(view.getId()==R.id.btn_bydate) {
            callFragment1.setBackground(ContextCompat.getDrawable(getContext(),R.drawable.background_edittext));
            callFragment1.setTextColor(Color.parseColor("#101340"));
            callFragment2.setBackground(ContextCompat.getDrawable(getContext(),R.drawable.border_btn));
            callFragment2.setTextColor(Color.parseColor("#ffffff"));
            getChildFragmentManager().beginTransaction().replace(R.id.home_framelayout, new home_child_fragment1()).commit();
        }
        if(view.getId()==R.id.btn_bymonth) {
            callFragment2.setBackground(ContextCompat.getDrawable(getContext(),R.drawable.background_edittext));
            callFragment2.setTextColor(Color.parseColor("#101340"));
            callFragment1.setBackground(ContextCompat.getDrawable(getContext(),R.drawable.border_btn));
            callFragment1.setTextColor(Color.parseColor("#ffffff"));
            getChildFragmentManager().beginTransaction().replace(R.id.home_framelayout, new home_child_fragment2()).commit();
        }
    }
}