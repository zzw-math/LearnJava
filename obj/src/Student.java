public class Student {

    //静态特征（数据）
    int id;
    String name;
    int score;
    int age;

    //方法（动态行为）（对数据的操作）
    public void study(){
        System.out.println("正在学习："+name);
    }

    //main方法是程序的入口！
    public static void main(String[] args) {
        Student  stu01 = new Student();
        stu01.id = 1001;
        stu01.name = "高淇";
        stu01.score = 90;
        stu01.age = 18;

        Student  stu02 = new Student();
        stu02.id = 1002;
        stu02.name = "高晓尔";
        stu02.score = 80;
        stu02.age = 19;

        stu01.study();
        stu02.study();



    }


}
