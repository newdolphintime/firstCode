package com.paly.zv.firstcode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        * LOG级别由低到高
        *
        * */
        Log.v("verbose","打印最为琐碎的，意义最小的日志信息");

        Log.d("debug","打印一些调试信息");

        Log.i("info","打印一些比较重要的数据");

        Log.w("warn","打印一些警报信息");

        Log.e("error","错误信息日志");


    }
    //输入logt按下Tab键会以当前类名自动生成一个TAG常量
    private static final String TAG = "MainActivity";
}
