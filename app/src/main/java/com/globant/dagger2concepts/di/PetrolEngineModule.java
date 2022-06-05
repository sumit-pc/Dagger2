package com.globant.dagger2concepts.di;

import com.globant.dagger2concepts.Car.Engine;
import com.globant.dagger2concepts.Car.PetrolEngine;
import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine petrolEngine);

}
