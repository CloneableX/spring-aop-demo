package com.clo.sa.domain;

/**
 * @author XuHong
 * @date 2019年02月18日 9:48
 */
public class Student {
    private String name;
    private int age;

    public String getName() {
        System.out.println("student get name");
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        System.out.println("student get age");
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printException() {
        System.out.println("student exception");
        throw new RuntimeException("bad method");
    }
}
