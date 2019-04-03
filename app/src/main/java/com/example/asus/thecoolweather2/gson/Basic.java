package com.example.asus.thecoolweather2.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {

    // @SerializedName标签定义属性序列化后的名字

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;

    }
}
