package com.memocation.eliaddegabli.memocation;

import android.app.Application;
import android.content.Context;

/**
 * Created by Eliad Degabli on 13/06/2017.
 */

public class MyApplication extends Application {

    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
    }

    public static Context getContext() {
        return mContext;
    }
}