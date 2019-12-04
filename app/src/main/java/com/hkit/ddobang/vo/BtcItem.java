package com.hkit.ddobang.vo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BtcItem {
    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("min_size")
    @Expose
    private String min_size;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMin_size() {
        return min_size;
    }

    public void setMin_size(String min_size) {
        this.min_size = min_size;
    }
}
