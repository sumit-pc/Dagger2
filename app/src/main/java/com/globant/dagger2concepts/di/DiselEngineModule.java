package com.globant.dagger2concepts;

import dagger.Module;
import dagger.Provides;

@Module
public class DiselEngineModule {

    @Provides
    Engine bindEngine(){
       return new DiselEngine();
    }
}
