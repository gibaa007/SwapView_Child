package com.adamandeve.g7.myapplication;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

/**
 * Created by newagesmb on 10/7/17.
 */

public class MyApplication extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

}