package com.example.factorymethodpattern;

import com.example.factorymethodpattern.domain.Car;
import com.example.factorymethodpattern.domain.Shoes;
import com.example.factorymethodpattern.factory.CarCreator;
import com.example.factorymethodpattern.factory.ShoesCreator;
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

    @Test
    void Equals_Shoes() {

        final ShoesCreator shoesCreator = new ShoesCreator();
        final Shoes shoes = (Shoes) shoesCreator.factory("NIKE");

        Assertions.assertEquals(shoes.getName(), "NIKE");
    }

}
