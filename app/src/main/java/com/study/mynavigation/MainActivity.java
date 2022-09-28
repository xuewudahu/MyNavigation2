package com.study.mynavigation;

import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("wxw","000000");
        Log.e("wxw","000000");//在服务器上更改的
        Log.e("wxw","000000");//在服务器上的分支Fixbug更改的
        Log.e("wxw","000000");//在本地更改
        Log.e("wxw","000000");//在服务器master更改
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
