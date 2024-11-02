package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

public abstract class Human {
    private String name;
    private String address;
    private short age;

    // Constructor with name and age
    public Human(String name, short age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String getAddress();

    public abstract void setAddress(String address);

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }
}

