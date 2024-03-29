package com.hkit.ddobang.vo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BoxOfficeResult {
    @SerializedName("boxofficeType")
    @Expose
    private String boxofficeType;

    @SerializedName("showRange")
    @Expose
    private String showRange;

    @SerializedName("yearWeekTime")
    @Expose
    private String yearWeekTime;

    @SerializedName("weeklyBoxOfficeList")
    @Expose
    private List<WeeklyBoxOffice> weeklyBoxOfficeList;

    public String getBoxofficeType() {
        return boxofficeType;
    }

    public void setBoxofficeType(String boxofficeType) {
        this.boxofficeType = boxofficeType;
    }

    public String getShowRange() {
        return showRange;
    }

    public void setShowRange(String showRange) {
        this.showRange = showRange;
    }

    public String getYearWeekTime() {
        return yearWeekTime;
    }

    public void setYearWeekTime(String yearWeekTime) {
        this.yearWeekTime = yearWeekTime;
    }

    public List<WeeklyBoxOffice> getWeeklyBoxOfficeList() {
        return weeklyBoxOfficeList;
    }

    public void setWeeklyBoxOfficeList(List<WeeklyBoxOffice> weeklyBoxOfficeList) {
        this.weeklyBoxOfficeList = weeklyBoxOfficeList;
    }
}
