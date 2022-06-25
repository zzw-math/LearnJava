import java.util.Objects;

/**
 * 测试Object类的用法
 */
public class TestObject {
    public static void main(String[] args) {

        Employee  e1 = new Employee(1001,"张三");
        Employee  e2 = new Employee(1001,"张三");
        System.out.println(e1);     //打印对象默认是调用的toString()

        System.out.println(e1==e2);     //两个对象是否相同！
        System.out.println(e1.equals(e2));  //两个对象是否相等（逻辑上进行某些值的比较）


    }
}


class Employee extends Object {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "雇员编号："+id+"，姓名："+name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}