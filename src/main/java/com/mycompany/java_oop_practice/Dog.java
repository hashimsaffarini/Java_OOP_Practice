package com.mycompany.java_oop_practice;

public class Dog extends Animal {

    @Override
    void walk() {
        System.out.println("Dog is Walk");
    }

    @Override
    int speed() {
        return 0;
    }

    @Override
    void printo(int x) {
        System.out.println(x);
    }

}
