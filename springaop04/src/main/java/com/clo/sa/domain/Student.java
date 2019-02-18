package com.clo.sa.domain;

import com.clo.sa.annotation.Loggable;

/**
 * @author XuHong
 * @date 2019年02月18日 11:14
 */
public class Student {
    private String name;
    private int age;

    @Loggable
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
}
