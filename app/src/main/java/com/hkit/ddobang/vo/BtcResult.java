package com.hkit.ddobang.vo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BtcResult {

    @SerializedName("data")
    @Expose
    private List<BtcItem> data;

    public List<BtcItem> getData() {
        return data;
    }

    public void setData(List<BtcItem> data) {
        this.data = data;
    }
}
