package com.example.factorymethodpattern.factory;

import com.example.factorymethodpattern.domain.Creator;
import com.example.factorymethodpattern.domain.Shoes;

public class ShoesCreator implements Creator {
    @Override
    public Object factory(String name) {
        return new Shoes(name);
    }
}
