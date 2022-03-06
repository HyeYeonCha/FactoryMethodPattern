package com.example.factorymethodpattern.factory;

import com.example.factorymethodpattern.domain.Creator;
import com.example.factorymethodpattern.domain.Car;

public class CarCreator implements Creator {
    @Override
    public Object factory(String name) {
        return new Car(name);
    }
}
