package com.itbaizhan.test3;

import com.itbaizhan.test2.Car;
import java.util.*;     //他会降低编译速度，但不会降低运行速度。

/**
 * 测试package、import
 */
public class Main {
    public static void main(String[] args) {
//        com.itbaizhan.test2.Car  car =  new com.itbaizhan.test2.Car();
        Car car = new Car();
        car.stop();

        String str = "";
        java.lang.String str2 = "";

        Date d = new Date();
        System.out.println(d);



    }
}
