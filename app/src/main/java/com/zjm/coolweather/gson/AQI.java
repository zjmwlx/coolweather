package com.zjm.coolweather.gson;

/**
 * Created by zjm on 2017/7/1.
 */

public class AQI {
    public AQICity city;


    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
