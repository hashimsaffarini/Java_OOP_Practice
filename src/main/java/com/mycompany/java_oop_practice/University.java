package com.mycompany.java_oop_practice;

public class University {

    int numberOfStudents;
    int x = 5;
    public int y = 10;
    protected int z = 20;
    private int a = 30;

    public University(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    void printInfo() {
        System.out.println("students number " + numberOfStudents);
    }

    void welcomeUniversity() {
        System.out.println("Welcome University");
    }

    int getA() {
        return a;
    }
}
