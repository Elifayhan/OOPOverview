package com.elifayhan.oopproject;

public class User extends People{
    String name;
    String job;

    public User(String name, String job) {
        this.name = name;
        this.job = job;
        System.out.println("User Created");
    }
}
