package com.globant.dagger2concepts.di;

import com.globant.dagger2concepts.Car.DiselEngine;
import com.globant.dagger2concepts.Car.Engine;

import dagger.Module;
import dagger.Provides;

@Module
public class DiselEngineModule {

    @Provides
    Engine bindEngine(){
       return new DiselEngine();
    }
}
