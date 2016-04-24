package com.example.ema.spaceapp;

import android.app.Activity;

/**
 * Created by EMA on 24/04/2016.
 */
public class ACt extends Activity {
    public static int point=100;

    public static int getPoint() {
        return point;
    }

    public static void setPoint(int point) {
        ACt.point = point;
    }
}
