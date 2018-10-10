package com.coolweather.android.gson;

/**
 * @author by sunzhongda
 * @date 2018/10/9
 */
public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
