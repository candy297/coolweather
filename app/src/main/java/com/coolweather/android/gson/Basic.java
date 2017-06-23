package com.coolweather.android.gson;

/**
 * Created by fang on 2017/6/23.
 */
import com.google.gson.annotations.SerializedName;

/*
* "basic":{
*     "city":"苏州"，
*     “id”:"CN101190401",
*     "update":{
*          "loc":"2017-06-23 10:20"
*      }
*  }
*
* */
public class Basic {

    @SerializedName("city")
    //使用@SerializedName注解的方式使得json字段与java字段建立映射关系
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }

}
