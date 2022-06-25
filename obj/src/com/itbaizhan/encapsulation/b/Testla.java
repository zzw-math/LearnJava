package com.itbaizhan.encapsulation.b;

import com.itbaizhan.encapsulation.a.Car;

public class Testla extends Car {
    void test(){
        //        super.check();        //不能访问其他类的私有
//        super.addOil();         //不同的包，不能访问default
        super.autoLighten();    //不在一个包的子类，也可以访问protected
        super.run();            //任何类都能访问public

    }
}
