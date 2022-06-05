package com.globant.dagger2concepts.di;

import com.globant.dagger2concepts.MainActivity;

import dagger.Component;

@Component(modules = {WheelsModule.class, DiselEngineModule.class})
public interface CarComponent {
    //Car getCar();

    void inject(MainActivity mainActivity);
}
