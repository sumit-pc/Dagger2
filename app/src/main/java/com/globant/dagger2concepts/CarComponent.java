package com.globant.dagger2concepts;

import dagger.Component;

@Component
public interface CarComponent {
    //Car getCar();

    void inject(MainActivity mainActivity);
}
