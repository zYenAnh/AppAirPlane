package com.example.airapp;

import static android.app.Activity.RESULT_OK;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.solver.state.State;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;


public class booktickets_fragment extends Fragment implements View.OnClickListener {

    private Button btnSearchByDate;
    private Button btnSearchByMonth;
    private ImageView swap_location;
    private TextView start_location;
    private TextView end_location;
    private String str_start;
    private String str_end;
    private ConstraintLayout layout_start_location;
    private ConstraintLayout layout_end_location;
    private ConstraintLayout constraint_RoundTrip;
    private Switch switchRoundTrip;
    private LinearLayout linearDate_Roundtrip;
    private LinearLayout linearSelectCustomer;
    private LinearLayout linearByMonth;
    private DatePickerDialog datePickerDialog;
    private TextView dateStartChange;
    String textStartLocation;
    DatePickerDialog.OnDateSetListener onDateSetLister;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_booktickets_fragment, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view,savedInstanceState);



        // set Values
        btnSearchByDate = (Button)view.findViewById(R.id.btn_bydate) ;
        btnSearchByMonth = (Button)view.findViewById(R.id.btn_bymonth);
        swap_location = (ImageView)view.findViewById(R.id.swap_location);
        start_location = (TextView)view.findViewById(R.id.start_location_text);
        end_location = (TextView)view.findViewById(R.id.end_location_text);
        layout_start_location = (ConstraintLayout)view.findViewById(R.id.layout_start_location);
        layout_end_location = (ConstraintLayout)view.findViewById(R.id.layout_end_location);
        switchRoundTrip = (Switch)view.findViewById(R.id.switchRoundTrip);
        constraint_RoundTrip = (ConstraintLayout) view.findViewById(R.id.constraint_RoundTrip);
        linearDate_Roundtrip = (LinearLayout)view.findViewById(R.id.linearDate_Roundtrip);
        linearSelectCustomer = (LinearLayout)view.findViewById(R.id.linearSelectCustomer);
        linearByMonth = (LinearLayout)view.findViewById(R.id.linearByMonth);
        dateStartChange = (TextView)view.findViewById(R.id.DateStarted);


        // callFunction
        constraint_RoundTrip.setVisibility(View.GONE);
        linearByMonth.setVisibility(View.GONE);
        btnSearchByDate.setOnClickListener(this);
        btnSearchByMonth.setOnClickListener(this);
        swap_location.setOnClickListener(this);
        layout_start_location.setOnClickListener(this);
        layout_end_location.setOnClickListener(this);
        switchRoundTrip.setOnClickListener(this);

        final Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int dateOfWeek = cal.get(Calendar.DAY_OF_WEEK);

        dateStartChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(
                        getContext(), android.R.style.Theme_Holo_Light_Dialog,onDateSetLister,day,month,year,dateOfWeek);
                datePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                datePickerDialog.show();
            }
        });

        onDateSetLister = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day,int dateOfWeek) {
                month += 1;
                String dateFinal = day + "/" + month + "/" + year;
                dateStartChange.setText(dateFinal);
            }
        };
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
            btnSearchByDate.setBackground(ContextCompat.getDrawable(getContext(),R.drawable.background_edittext));
            btnSearchByDate.setTextColor(Color.parseColor("#101340"));
            btnSearchByMonth.setBackground(ContextCompat.getDrawable(getContext(),R.drawable.border_btn));
            btnSearchByMonth.setTextColor(Color.parseColor("#ffffff"));
            linearDate_Roundtrip.setVisibility(View.VISIBLE);
            linearSelectCustomer.setVisibility(View.VISIBLE);
            linearByMonth.setVisibility(View.GONE);
        }
        if(view.getId()==R.id.btn_bymonth) {
            btnSearchByMonth.setBackground(ContextCompat.getDrawable(getContext(),R.drawable.background_edittext));
            btnSearchByMonth.setTextColor(Color.parseColor("#101340"));
            btnSearchByDate.setBackground(ContextCompat.getDrawable(getContext(),R.drawable.border_btn));
            btnSearchByDate.setTextColor(Color.parseColor("#ffffff"));
            linearByMonth.setVisibility(View.VISIBLE);
            linearDate_Roundtrip.setVisibility(View.GONE);
            linearSelectCustomer.setVisibility(View.GONE);
        }
        if(view.getId()==R.id.layout_start_location) {
            Intent i = new Intent(getActivity(),choose_airport.class);
            int REQUEST_CODE = 9;
            startActivityForResult(i,REQUEST_CODE);
        }
        if(view.getId()==R.id.layout_end_location) {
            Intent i = new Intent(getActivity(),choose_airport.class);
            int REQUEST_CODE = 10;
            startActivityForResult(i,REQUEST_CODE);
        }
        if(view.getId()==R.id.switchRoundTrip) {
            boolean checkRoundTrip = switchRoundTrip.isChecked();
            if(checkRoundTrip)
                constraint_RoundTrip.setVisibility(View.VISIBLE);
            else
                constraint_RoundTrip.setVisibility(View.GONE);
        }
    }

//    private String getMonthFormat(int month) {
//        switch (month) {
//            case 1:
//                return "JAN";
//            case 2:
//                return "FEB";
//            case 3:
//                return "MAR";
//            case 4:
//                return "APR";
//            case 5:
//                return "MAY";
//            case 6:
//                return "JUN";
//            case 7:
//                return "JUL";
//            case 8:
//                return "AUG";
//            case 9:
//                return "SEP";
//            case 10:
//                return "OCT";
//            case 11:
//                return "NOV";
//            case 12:
//                return "DEC";
//        }
//        return "JAN";
//    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(resultCode==RESULT_OK && requestCode ==9) {
            if(data.hasExtra("IDAirport"));
            textStartLocation = data.getExtras().getString("ProvinceCity")
                    + " ("+ data.getExtras().getString("IDAirport") + ")";
            start_location.setText(textStartLocation);
        }
        if(resultCode==RESULT_OK && requestCode ==10) {
            if(data.hasExtra("IDAirport"));
            textStartLocation = data.getExtras().getString("ProvinceCity")
                    + " ("+ data.getExtras().getString("IDAirport") + ")";
            end_location.setText(textStartLocation);
        }
    }
}