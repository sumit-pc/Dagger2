package com.globant.dagger2concepts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.globant.dagger2concepts.Car.Car;
import com.globant.dagger2concepts.di.CarComponent;
import com.globant.dagger2concepts.di.DaggerCarComponent;
import com.globant.dagger2concepts.di.DiselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    public Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent carComponent = DaggerCarComponent.builder()
                .diselEngineModule(new DiselEngineModule(15000)).build();

        carComponent.inject(this);
        car.drive();

    }
}