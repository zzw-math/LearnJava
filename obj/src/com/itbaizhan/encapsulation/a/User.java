package com.itbaizhan.encapsulation.a;

public class User {

    private int id;
    private String name;
    private String pwd;
    private boolean admin;      //是不是超级管理员账户


    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id>0){
            this.id = id;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }


    public void login(){
        System.out.println("User.login");
    }


}
