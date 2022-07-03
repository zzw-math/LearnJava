package com.itbaizhan;

/**
 * 测试数组的使用
 */
public class Test02 {

    public static void main(String[] args) {
        User[]  users = new User[3];
        //静态初始化
        User user2[] = {
                new User(101,"tome"),
                new User(102,"smith"),
                new User(101,"lily")
        };

        users[0] = new User(1001,"张三");
        users[1] = new User(1002,"李四");
        users[2] = new User(1003,"王五");

        for(int i=0;i<users.length;i++) {
            System.out.println(users[i]);
        }

        for(User u:user2) {
            System.out.println(u);
        }



    }

}

class User {
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
