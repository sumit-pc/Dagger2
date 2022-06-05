package com.globant.dagger2concepts.Car;

import android.util.Log;

import javax.inject.Inject;

public class Remote {
    private static final String TAG = "Car";

    @Inject
    Remote(){

    }
    public void setListner(){
        Log.d(TAG, "Remote connected");
    }
}
