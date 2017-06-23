package com.coolweather.android.gson;

/**
 * Created by fang on 2017/6/23.
 */
import com.google.gson.annotations.SerializedName;

/*
* "now":{
*    “tmp”："29"，
*     "cond":{
*       “txt”："阵雨"
*     }
*  }
*
* */
public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }

}
