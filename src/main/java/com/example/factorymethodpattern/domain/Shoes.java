package com.example.factorymethodpattern.domain;

public class Shoes {
    private String name;

    public Shoes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
