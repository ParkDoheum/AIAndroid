package com.hkit.ddobang.vo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rates {
    @SerializedName("AED")
    @Expose
    private String aed;

    @SerializedName("AFN")
    @Expose
    private String afn;

    @SerializedName("ALL")
    @Expose
    private String all;

    public String getAed() {
        return aed;
    }

    public void setAed(String aed) {
        this.aed = aed;
    }

    public String getAfn() {
        return afn;
    }

    public void setAfn(String afn) {
        this.afn = afn;
    }

    public String getAll() {
        return all;
    }

    public void setAll(String all) {
        this.all = all;
    }
}
