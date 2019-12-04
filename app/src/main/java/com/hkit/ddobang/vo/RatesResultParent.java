package com.hkit.ddobang.vo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RatesResultParent {
    @SerializedName("data")
    @Expose
    private RatesResult data;

    public RatesResult getData() {
        return data;
    }

    public void setData(RatesResult data) {
        this.data = data;
    }
}
