public class Person {
    String name;
    int age;

    public void show(){
        System.out.println("姓名："+name+"\t年龄："+age);
    }

    Person(String _name,int _age){
        name = _name;
        age = _age;
    }

    Person(){
    }


    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 24;
        p1.name = "张三";
        p1.show();

        Person p2 = new Person("李四",30);
        p2.show();

    }

}
