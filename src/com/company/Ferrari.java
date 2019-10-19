package com.company;

import com.company.Car;

public class Ferrari extends Car {
    @Override
    public void carType() {
        System.out.println("Racing");
    }

    @Override
    public void carSpeed() {
        System.out.println(260);
    }
}