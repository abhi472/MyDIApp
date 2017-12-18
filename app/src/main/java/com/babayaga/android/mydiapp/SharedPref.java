package com.babayaga.android.mydiapp;

/**
 * Created by abhishek on 18/12/17.
 */

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class SharedPref {

    private static final int MODE_PRIVATE = 0;
    String perfName = "VVS";
    private SharedPreferences pref;
    private Editor editor;

    @Inject
    public SharedPref(SharedPreferences pref) {
        this.pref = pref;
        editor = pref.edit();
    }

    public void SaveString(String Key, String value) {
        editor.putString(Key, value);
        editor.commit();
    }

    public void SaveInt(String Key, int value) {
        editor.putInt(Key, value);
        editor.commit();
    }

    public void SaveBolean(String Key, Boolean value) {
        editor.putBoolean(Key, value);
        editor.commit();
    }

    public void saveLong(String key, Long value) {
        editor.putLong(key, value).commit();
    }

    public void update(String Key, String value) {
        editor.putString(Key, value);
        editor.apply();
    }

    public boolean check(String Key) {
        return pref.contains(Key);
    }

    public void delete(String Key) {
        editor.remove(Key);
        editor.commit();
    }

    public String getString(String Key) {
        return pref.getString(Key, "");
    }

    public int getInt(String Key) {
        return pref.getInt(Key, 0);
    }

    public Boolean getBolean(String Key) {
        return pref.getBoolean(Key, true);
    }

    public Long getLong(String key) {
        return pref.getLong(key, 0L);
    }

}

