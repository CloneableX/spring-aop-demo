package com.clo.sa.domain;

/**
 * @author XuHong
 * @date 2019年02月15日 16:31
 */
public class Student {
    private Long id;
    private String name;

    public String printThrowException() {
        System.err.println("Exception raised");
        throw new RuntimeException("This method is bad");
    }

    public Long getId() {
        System.err.println("Id is:" + id);
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        System.err.println("Name is:" + name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
