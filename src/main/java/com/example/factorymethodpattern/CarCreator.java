package com.example.factorymethodpattern;

public class CarCreator implements Creator {
    @Override
    public Object factory(String name) {
        return new Car(name);
    }
}
