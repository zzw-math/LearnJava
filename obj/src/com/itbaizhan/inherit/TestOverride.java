package com.itbaizhan.inherit;

/**
 * 测试重写
 */
public class TestOverride {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.run();

        Plane p = new Plane();
        p.stop();
    }
}


class Vehicle{

    //final修饰方法。则这个方法不能在子类中重写！
    public final void addOil(){
        System.out.println("oil!!!");
    }

    public void run(){
        System.out.println("run....");
    }
    public void stop(){
        System.out.println("stop...");
    }
}

class Horse extends Vehicle {
    public void run(){
        System.out.println("四踢翻飞，嘚嘚...");
    }

}

class Plane extends Vehicle {
    public void run(){
        System.out.println("天上飞..");
    }
    public void stop(){
        System.out.println("在机场停下，不能再天上停");
    }
}