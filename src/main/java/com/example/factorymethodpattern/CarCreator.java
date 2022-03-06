package com.example.factorymethodpattern;

public class CarCreator implements Creator {
    @Override
    public Object factory(String name) {
        Car car = new Car(name);
        return car;
    }
}
