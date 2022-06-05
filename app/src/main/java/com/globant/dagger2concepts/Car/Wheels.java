package com.globant.dagger2concepts.Car;

import javax.inject.Inject;

public class Wheels {

    private Rims rims;
    private Tires tires;

    @Inject
    Wheels(Rims rims, Tires tires){
        this.rims = rims;
        this.tires = tires;
    }
}
