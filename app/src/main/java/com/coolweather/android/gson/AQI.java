package com.coolweather.android.gson;

/**
 * Created by fang on 2017/6/23.
 */

/*
* "aqi":{
*     "city":{
*       “aqi”："44"，
*       “pm25”:"13",
*     }
*  }
*
* */
public class AQI {

    public AQICity city;

    public class AQICity {

        public String aqi;

        public String pm25;

    }

}
