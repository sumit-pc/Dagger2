package com.globant.dagger2concepts.Car;

import android.util.Log;

import javax.inject.Inject;

public class DiselEngine implements Engine {
    private static final String TAG = "Car";

    @Inject
    public DiselEngine() {

    }

    @Override
    public void start() {
        Log.d(TAG, "Disel engine started");
    }
}
