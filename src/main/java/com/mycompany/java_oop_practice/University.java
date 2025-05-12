package com.mycompany.java_oop_practice;

public class University {

    int numberOfStudents;

    public University(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    void printInfo() {
        System.out.println("students number " + numberOfStudents);
    }

    void welcomeUniversity() {
        System.out.println("Welcome University");
    }
}
