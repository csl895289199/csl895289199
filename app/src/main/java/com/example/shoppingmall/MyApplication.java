package com.example.shoppingmall;

import android.app.Application;


import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initOkHttpClient();

    }

    private void initOkHttpClient() {

        //创建okHttpClient对象
        OkHttpClient mOkHttpClient = new OkHttpClient();
         //创建一个Request
        final Request request = new Request.Builder()
                .url("https://github.com/hongyangAndroid")
                .build();
           //new call
        Call call = mOkHttpClient.newCall(request);
         //请求加入调度
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {
                //请求失败
            }

            @Override
            public void onResponse(final Response response) throws IOException {
                //String htmlStr =  response.body().string();
                //请求成功
            }
        });

    }

}