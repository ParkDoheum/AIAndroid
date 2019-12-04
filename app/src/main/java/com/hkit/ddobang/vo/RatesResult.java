package com.hkit.ddobang.vo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RatesResult {
    @SerializedName("currency")
    @Expose
    private String currency;

    @SerializedName("rates")
    @Expose
    private Rates rates;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Rates getRates() {
        return rates;
    }

    public void setRates(Rates rates) {
        this.rates = rates;
    }
}
