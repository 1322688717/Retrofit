package com.example.retrofitdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.retrofitdemo.Bean.Bean_status;
import com.example.retrofitdemo.NetWork.GetRequest_Interface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        request();
        // 使用Retrofit封装的方法
    }
    public void request() {

        //步骤4:创建Retrofit对象
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.caiyunapp.com/") // 设置 网络请求 Url
                .addConverterFactory(GsonConverterFactory.create()) //设置使用Gson解析(记得加入依赖)
                .build();

        // 步骤5:创建 网络请求接口 的实例
        GetRequest_Interface request = retrofit.create(GetRequest_Interface.class);

        //对 发送请求 进行封装
        Call<Bean_status> call = request.getCall();

        //步骤6:发送网络请求(异步)
        call.enqueue(new Callback<Bean_status>() {
            //请求成功时回调
            @Override
            public void onResponse(Call<Bean_status> call, Response<Bean_status> response) {
                // 步骤7：处理返回的数据结果
                response.body();
                Log.e("TAG"," status："+response.body().getStatus());
                Log.e("TAG"," Api_version："+response.body().getApi_version());
                Log.e("TAG"," Api_status："+response.body().getApi_status());
                Log.e("TAG"," Lang："+response.body().getLang());
                Log.e("TAG"," Unit："+response.body().getUnit());
                Log.e("TAG"," Tzshift："+response.body().getTzshift());
                Log.e("TAG"," Server_time："+response.body().getServer_time());
            }

            //请求失败时回调
            @Override
            public void onFailure(Call<Bean_status> call, Throwable throwable) {
                System.out.println("连接失败");
            }
        });
    }
}
