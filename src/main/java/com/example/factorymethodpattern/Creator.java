package com.example.factorymethodpattern;


public interface Creator {
    // object 형태를 반환하는 factory 메소드
    Object factory(String name);
}
