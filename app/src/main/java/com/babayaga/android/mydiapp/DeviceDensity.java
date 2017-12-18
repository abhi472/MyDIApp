package com.babayaga.android.mydiapp;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

import javax.inject.Inject;

/**
 * Created by abhishek on 18/12/17.
 */

public class DeviceDensity {


    public static float convertPixelsToDp(float px){
        return px / ((float)new DisplayMetrics().densityDpi / DisplayMetrics.DENSITY_DEFAULT);
    }
    public static float convertDpToPixel(float dp){

        return dp * ((float)new DisplayMetrics().densityDpi / DisplayMetrics.DENSITY_DEFAULT);
    }
    public static float getHeight()
    {
        return new DisplayMetrics().heightPixels;
    }
    public static float getWidth()
    {
        return new DisplayMetrics().widthPixels;
    }
}

