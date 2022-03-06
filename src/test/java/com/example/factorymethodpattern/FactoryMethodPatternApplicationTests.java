package com.example.factorymethodpattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class FactoryMethodPatternApplicationTests {

    @Test
    void Equals_Car() {

        final CarCreator carCreator = new CarCreator();
        final Car car = (Car) carCreator.factory("TSLA");

        Assertions.assertEquals(car.name, "TSLA");
    }

}
