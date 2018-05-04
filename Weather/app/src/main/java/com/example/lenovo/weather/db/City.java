package com.example.lenovo.weather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by lenovo on 2018/5/4.
 */

public class City extends DataSupport {

    private int id;
    private String cityName;
    private int cityCode;//市的代号
    private int provinceId;//市所在省份的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
