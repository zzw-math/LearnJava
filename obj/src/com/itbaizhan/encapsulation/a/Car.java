package com.itbaizhan.encapsulation.a;

public class Car {
    int id;
    String brand;

    private void check(){
        System.out.println("Car.check");
    }

    void addOil(){
        System.out.println("Car.addOil");
    }

    protected void autoLighten(){
        System.out.println("Car.autoLighten");
    }

    public void run(){
        System.out.println("Car.run");
    }

}
