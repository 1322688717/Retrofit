package com.example.retrofitdemo.NetWork;

import com.example.retrofitdemo.Bean.Bean_status;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetRequest_Interface {

    @GET("v2.5/7KlicJFJqOmm3iIn/114.5,30.4/realtime.json")
    Call<Bean_status> getCall();
    // 注解里传入 网络请求 的部分URL地址
    // Retrofit把网络请求的URL分成了两部分：一部分放在Retrofit对象里，另一部分放在网络请求接口里
    // 如果接口里的url是一个完整的网址，那么放在Retrofit对象里的URL可以忽略
    // getCall()是接受网络请求数据的方法
}
