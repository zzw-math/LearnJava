package com.itbaizhan.abstractClass;

//抽象类
public abstract class Animal {

    //抽象方法
    public abstract void shout();

    public void sleep(){
        System.out.println("Animal.sleep");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.shout();

//        Animal a = new Animal();

    }

}

class Dog extends  Animal {
    @Override
    public void shout() {
        System.out.println("Dog.shout");
    }
}

class Cat extends Animal {

    @Override
    public void shout() {
        System.out.println("Cat.shout");
    }
}