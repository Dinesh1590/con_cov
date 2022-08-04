package com.currencyconverter.curcov.model;

public class CurrencyDTO {

    private String fCountry;
    private String tCountry;

    public String getfCountry() {
        return fCountry;
    }

    public String gettCountry() {
        return tCountry;
    }

    public Double getValue() {
        return value;
    }

    private Double value;
}
