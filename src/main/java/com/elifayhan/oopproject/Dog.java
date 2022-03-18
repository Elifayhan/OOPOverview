package com.elifayhan.oopproject;

public class Dog extends Animal{
    public void test(){
        super.sign(); //super kalıtım aldığımız sınıfa referans eder.
    }
    //sign ismine sahip başka bir method da yazabiliriz.
    public void sign(){
        System.out.println("Dog class");
    }
}
