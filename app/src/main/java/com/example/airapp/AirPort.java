package com.example.airapp;

public class AirPort {
    private int idAirPort;
    private String abbreviations;
    private String provinceOrCity;
    private String nameAirPort;

    public int getIdAirPort() {
        return idAirPort;
    }

    public void setIdAirPort(int idAirPort) {
        this.idAirPort = idAirPort;
    }

    public String getAbbreviations() {
        return abbreviations;
    }

    public void setAbbreviations(String abbreviations) {
        this.abbreviations = abbreviations;
    }

    public String getProvinceOrCity() {
        return provinceOrCity;
    }

    public void setProvinceOrCity(String provinceOrCity) {
        this.provinceOrCity = provinceOrCity;
    }

    public String getNameAirPort() {
        return nameAirPort;
    }

    public void setNameAirPort(String nameAirPort) {
        this.nameAirPort = nameAirPort;
    }

    public AirPort(int idAirPort, String abbreviations, String provinceOrCity, String nameAirPort) {
        this.idAirPort = idAirPort;
        this.abbreviations = abbreviations;
        this.provinceOrCity = provinceOrCity;
        this.nameAirPort = nameAirPort;
    }
}
