package com.globant.dagger2concepts;

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
