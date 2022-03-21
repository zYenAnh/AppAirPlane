package com.example.airapp;

import java.util.Date;

public class FlightTicket {
    private int idTicket;
    private String departureDay;
    private String departureTime;
    private String landingTime;
    private String departure;
    private String destination;
    private String airstrip;
    private long price;
    private String ticketType;
    private String airline;
    private int logoAirline;
    private boolean isPaid;
    private int iconPaid;

    public int getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    public String getDepartureDay() {
        return departureDay;
    }

    public void setDepartureDay(String departureDay) {
        this.departureDay = departureDay;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getLandingTime() {
        return landingTime;
    }

    public void setLandingTime(String landingTime) {
        this.landingTime = landingTime;
    }

    public  String getAirstrip() { return airstrip;}

    public void setAirstrip(String airstrip) { this.airstrip = airstrip; }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlightDirection() { return airstrip;}

    public void setFlightDirection(String airstrip) {this.airstrip = airstrip;}

    public String getTicketType() {return ticketType;}

    public  void setTicketType(String ticketType) {this.ticketType = ticketType;}

    public Long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getLogoAirline() {
        return logoAirline;
    }

    public void setLogoAirline(int logoAirline) {
        this.logoAirline = logoAirline;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public int getIconPaid() {
        return iconPaid;
    }

    public void setIconPaid(int iconPaid) {
        this.iconPaid = iconPaid;
    }

    public FlightTicket(int idTicket, String departureDay, String departureTime, String landingTime, String departure, String destination,
                        String airstrip, long price, String airline, String ticketType, int logoAirline, boolean isPaid, int iconPaid) {
        this.idTicket = idTicket;
        this.departureDay = departureDay;
        this.departureTime = departureTime;
        this.landingTime = landingTime;
        this.departure = departure;
        this.destination = destination;
        this.airstrip = airstrip;
        this.ticketType = ticketType;
        this.price = price;
        this.airline = airline;
        this.logoAirline = logoAirline;
        this.isPaid = isPaid;
        this.iconPaid = iconPaid;
    }
}
