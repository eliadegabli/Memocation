package com.memocation.eliaddegabli.memocation;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Eliad Degabli on 13/06/2017.
 */

public class MemocationSharedPreferencesManager {

    private static MemocationSharedPreferencesManager INSTANCE = null;
    public static final String MyPREFERENCES = "memoPrefKey" ;
    SharedPreferences sharedPreferences;

    private MemocationSharedPreferencesManager(){
        sharedPreferences = MyApplication.getContext().getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
    }

    public static MemocationSharedPreferencesManager getInstance() {
        if(INSTANCE == null)
            INSTANCE = new MemocationSharedPreferencesManager();

        return INSTANCE;
    }


    public void setMemoPrefs(String key,String value){
        sharedPreferences.edit().putString(key,value).apply();
    }
    public void setMemoPrefs(String key,boolean value){
        sharedPreferences.edit().putBoolean(key,value).apply();
    }
    public void setMemoPrefs(String key,int value){
        sharedPreferences.edit().putInt(key,value).apply();
    }

    public String getMemoPrefs(String key,String def){
        return sharedPreferences.getString(key,def);
    }
    public boolean getMemoPrefs(String key, boolean def){
        return sharedPreferences.getBoolean(key,def);
    }
    public int getMemoPrefs(String key,int def){
        return sharedPreferences.getInt(key,def);
    }

}
