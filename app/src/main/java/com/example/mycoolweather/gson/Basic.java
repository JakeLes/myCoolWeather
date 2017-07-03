package com.example.mycoolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/7/3.
 *
 * 使用@SerializedName注解的方式让Json字段和Java字段之间建立映射关系
 *
 *      "basic":{
 *          "city":"苏州"
 *          "id":"CN101190401"
 *          "update":{
 *              "loc":"2017-07-03 15:12"
 *          }
 *      }
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public  String updateTime;
    }
}
