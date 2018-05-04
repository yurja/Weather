package com.example.lenovo.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lenovo on 2018/4/22.
 */

public class Now { //当前天气

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
