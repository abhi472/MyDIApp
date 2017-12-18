package com.babayaga.android.mydiapp;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

import dagger.Module;
import dagger.Provides;

/**
 * Created by abhishek on 18/12/17.
 */

@Module
public class ActivityModule {

    private Activity mActivity;

    public ActivityModule(Activity activity) {
        mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    Activity provideActivity() {
        return mActivity;
    }

    @Provides
    SharedPreferences provideSharedPrefs() {
        return mActivity.getSharedPreferences("demo-prefs", Context.MODE_PRIVATE);
    }
}
