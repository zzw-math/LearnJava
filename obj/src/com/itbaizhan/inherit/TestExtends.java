package com.itbaizhan.inherit;

import java.util.Objects;

/**
 * 测试继承的基本用法
 */
public class TestExtends {
    public static void main(String[] args) {
        Student stu1 = new Student("高淇",172,"java");
        stu1.rest();
        stu1.study();
        System.out.println(stu1.name);

        //instanceof判断对象是否是这个类的实例对象
        System.out.println(stu1 instanceof Student);
        System.out.println(stu1 instanceof Person);


    }
}

class Person  {
    String name;
    int height;

    public void rest(){
        System.out.println("休息一会！");
    }
}

class Student extends  Person {
    String major;

    public void study(){
        System.out.println("Student.study");
    }

    public Student(String name,int height,String major){
        this.name = name;
        this.height = height;
        this.major = major;

    }


}
