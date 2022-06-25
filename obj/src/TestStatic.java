/**
 * 测试static的用法
 */
public class TestStatic {

    int id;

    static String company = "北京尚学堂";
    static int companyId = 0;

    static {
        System.out.println("类被初始化的调用！");
        companyId = 111222;
    }


    static void printCompany(){
        System.out.println(company);
//        System.out.println(this);     //static方法中不能使用非static成员！
    }

    void login(){
        System.out.println("登陆");
    }

    public static void main(String[] args) {
        TestStatic.printCompany();

        TestStatic t1 = new TestStatic();
        t1.login();
        TestStatic t2 = new TestStatic();
        t2.login();
    }

}
