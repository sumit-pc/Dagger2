package com.globant.dagger2concepts;

import android.util.Log;

import javax.inject.Inject;

public class Tires {

    Tires(){}
    private static final String TAG = "Car";

    public void inflate() {
        Log.d(TAG, "Tires inflated");
    }
}
