package com.mycompany.java_oop_practice;

public class Ptuk extends University {

    int x;

    Ptuk() {// super(); default
        super(20);
//        System.out.println("PTUK");
    }

    Ptuk(int x) {// super(); default constructer
        super(20);
        this.x = x;
//        System.out.println("X");
    }

    public Ptuk(int x, int numberOfStudents) {
        super(numberOfStudents);
        this.x = x;
    }

    @Override
    void welcomeUniversity() {
        System.out.println("PTUKKKKK");
    }

}
