package com.globant.dagger2concepts.di;

import com.globant.dagger2concepts.Car.Engine;
import com.globant.dagger2concepts.Car.PetrolEngine;

import dagger.Module;
import dagger.Provides;

@Module
public class PetrolEngineModule {

    @Provides
    Engine bindEngine(){
        return new PetrolEngine();
    }

}
