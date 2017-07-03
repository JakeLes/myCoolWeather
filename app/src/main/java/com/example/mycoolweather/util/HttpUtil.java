package com.example.mycoolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**网络工具类
 * Created by Administrator on 2017/7/3.
 */

public class HttpUtil {
    public static  void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request =new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
