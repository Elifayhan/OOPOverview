package com.elifayhan.oopproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User myUser = new User("Atil", "instructor");
        System.out.println(myUser.information());

        //Encapsulation
        Musicians james=new Musicians("James", "Guitar",50);
        System.out.println(james.getAge());
        james.setAge(60,    "Atil");
        System.out.println(james.getAge());

        //Inheritance
        SuperMusicians lars= new SuperMusicians("Lars", "Drums",55);
        System.out.println(lars.sign());
        System.out.println(lars.getAge());

        // Static Polymorphism
        Mathematics mathematics = new Mathematics();
        System.out.println(mathematics.sum());
        System.out.println(mathematics.sum(5,3));
        System.out.println(mathematics.sum(5,3,2));

        //Dynamic Polymorphism
        Animal animal=new Animal();
        animal.sign();
        Dog barley= new Dog();
        barley.sign();
        barley.test();
        Piano myPiano= new Piano();
        myPiano.brand="Yamaha";
        myPiano.digital=true;
        myPiano.info();
    }
}