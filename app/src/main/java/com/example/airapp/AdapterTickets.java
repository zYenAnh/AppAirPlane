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

public class AdapterTickets extends BaseAdapter {

    private Context context;
    private int layout;
    private List<FlightTicket> arrayListTickets;

    public AdapterTickets(Context context, int layout, List<FlightTicket> arrayListTickets) {
        this.context = context;
        this.layout = layout;
        this.arrayListTickets = arrayListTickets;
    }

    @Override
    public int getCount() {
        return arrayListTickets.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @SuppressLint({"ViewHolder", "SetTextI18n"})
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        view = inflater.inflate(layout,null);

        FlightTicket flTicket = arrayListTickets.get(i);
        TextView departureDate = view.findViewById(R.id.departureDate);
        TextView departureTime = view.findViewById(R.id.departureTime);
        TextView landingTime = view.findViewById(R.id.landingTime);
        TextView destination = view.findViewById(R.id.destination);
        TextView departure = view.findViewById(R.id.departure);
        TextView airstrip = view.findViewById(R.id.airstrip);
        TextView ticketType = view.findViewById(R.id.ticketType);
        ImageView imageViewAirline = view.findViewById(R.id.imageViewAirline);
        TextView Airline = view.findViewById(R.id.Airline);
        TextView priceTicket = view.findViewById(R.id.priceTicket);
        ImageView iconPaid = view.findViewById(R.id.iconPaid);
        TextView TextPaid = view.findViewById(R.id.TextPaid);

        departureDate.setText(flTicket.getDepartureDay().toString());
        departureTime.setText(flTicket.getDepartureTime());
        landingTime.setText(flTicket.getLandingTime());
        destination.setText(flTicket.getDestination());
        departure.setText(flTicket.getDeparture());
        airstrip.setText(flTicket.getAirstrip());
        ticketType.setText(flTicket.getTicketType());
        imageViewAirline.setImageResource(flTicket.getLogoAirline());
        Airline.setText(flTicket.getAirline());
        priceTicket.setText(flTicket.getPrice().toString());
        iconPaid.setImageResource(flTicket.getIconPaid());
        TextPaid.setText(flTicket.isPaid()?"Đã thanh toán":"Chưa thanh toán");

        return view;
    }
}
