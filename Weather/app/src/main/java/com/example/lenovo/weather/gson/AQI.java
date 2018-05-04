package com.example.lenovo.weather.gson;

/**
 * Created by lenovo on 2018/4/22.
 */

public class AQI { //空气质量

    public AQICity city;

    public class AQICity{

        public String aqi;
        public String pm25;
        public String qlty;
    }
}
