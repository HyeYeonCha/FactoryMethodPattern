package com.example.factorymethodpattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FactoryMethodPatternApplicationTests {

    @Test
    void Equals_Car() {

        final CarCreator carCreator = new CarCreator();
        final Car car = (Car) carCreator.factory("TSLA");

        Assertions.assertEquals(car.getName(), "TSLA");
    }

}
