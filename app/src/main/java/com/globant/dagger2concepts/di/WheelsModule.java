package com.globant.dagger2concepts.di;

import com.globant.dagger2concepts.Car.Rims;
import com.globant.dagger2concepts.Car.Tires;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

    @Provides
    Rims provideRims(){
        return new Rims();
    }

    @Provides
    Tires provideTires(){
        Tires tire = new Tires();
        tire.inflate();
        return tire;
    }

}
