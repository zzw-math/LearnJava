/**
 * 测试接口的多继承
 */
public class TestInterface2 implements C {

    @Override
    public void testa() {
        System.out.println("TestInterface2.testa");
    }

    @Override
    public void testb() {
        System.out.println("TestInterface2.testb");
    }

    @Override
    public void testc() {
        System.out.println("TestInterface2.testc");
    }

    public static void main(String[] args) {
        C c = new TestInterface2();
        c.testa();
        c.testb();
        c.testc();
    }
}

interface A {
    void testa();
}

interface  B{
    void testb();
}

interface C extends A,B {
    void testc();
}
