/**
 * 测试接口的：默认方法、静态方法
 */
public class TestInterface3 {
    public static void main(String[] args) {
        TestA  ta = new TestA();
        ta.moren1();

        A1.staticMethod();  //通过接口名称直接调用静态方法
        TestA.staticMethod();   //调用实现类的静态方法

        TestB tb = new TestB();
        tb.moren1();
    }
}

interface A1 {

    default  void  moren1(){
        System.out.println("A1.moren1");
    }

    default  void  moren2(){
        System.out.println("A1.moren2");
    }

    static void  staticMethod(){
        System.out.println("A1.staticMethod");
    }


}

interface B1 {
    default void moren1(){
        System.out.println("B1.moren1");
    }
}


class TestA implements A1 {
    @Override
    public void moren1() {
        System.out.println("TestA.moren1");
    }

    static void staticMethod(){
        System.out.println("TestA.staticMethod");
    }

}

class TestB implements A1,B1 {
    @Override
    public void moren1() {
        System.out.println("TestB.moren1");
    }
}