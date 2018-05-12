package com.example.lenovo.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lenovo on 2018/4/22.
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    @SerializedName("wind")
    public Wind wind;

    public class Temperature{

        public String max;

        public String min;
    }

    public class More{

        @SerializedName("txt_d")
        public String day_info;

    }

    public class Wind{

        @SerializedName("dir")
        public String dir;
    }

}
