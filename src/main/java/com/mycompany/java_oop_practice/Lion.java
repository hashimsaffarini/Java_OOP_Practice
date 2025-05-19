package com.mycompany.java_oop_practice;

public class Lion extends Animal implements AAA, BBB {

    @Override
    void walk() {
        System.out.println("Lion is Walk");
    }

    @Override
    int speed() {
        return 0;
    }

    @Override
    void printo(int x) {
        System.out.println(x);
    }

    @Override
    public void a() {
    }

    @Override
    public void b() {
    }
}
