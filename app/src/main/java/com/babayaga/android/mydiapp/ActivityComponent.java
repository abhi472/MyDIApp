package com.babayaga.android.mydiapp;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by abhishek on 18/12/17.
 */

@Singleton
@Component(modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

    SharedPref getSharedPref();

}
