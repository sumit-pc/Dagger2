package com.globant.dagger2concepts.Car;

import android.util.Log;

import javax.inject.Inject;

public class DiselEngine implements Engine {

    private static final String TAG = "Car";
    private int hoursepower;

    public DiselEngine(Integer hoursepower) {
        this.hoursepower = hoursepower;
    }

    @Override
    public void start() {
        Log.d(TAG, "Disel engine started. Hoursepower is "+ hoursepower);
    }
}
