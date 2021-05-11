package com.example.shoppingmall;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class WelcomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        new Handler().postDelayed(new Runnable() {
            //2秒钟后进入主页面
            @Override
            public void run() {
                //执行在主线程
                startActivity(new Intent(WelcomeActivity.this,MainActivity.class));
                //启动主页面
                finish();//关闭当前页面
            }
        },2000);

    }
}
