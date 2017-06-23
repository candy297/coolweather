package com.coolweather.android.gson;

/**
 * Created by fang on 2017/6/23.
 */
import com.google.gson.annotations.SerializedName;


/*
* "daily_forecast":{
*     {
*       “date”："2017-6-24",
*        "cond":{
*         “txt_d”："阵雨"
*        }，
*        "tmp":{
*           “max”："34"，
*           “min”："27"，
*        }
*     }，
*     {
*       “date”："2017-6-25",
*        "cond":{
*         “txt_d”："多云"
*        }，
*        "tmp":{
*           “max”："35"，
*           “min”："29"，
*        }
*     }
*
*  }
*
* */
public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {

        public String max;

        public String min;

    }

    public class More {

        @SerializedName("txt_d")
        public String info;

    }

}
