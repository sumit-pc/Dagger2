package com.globant.dagger2concepts;

import dagger.Module;
import dagger.Provides;

@Module
public class PetrolEngineModule {

    @Provides
    Engine bindEngine(){
        return new PetrolEngine();
    }

}
