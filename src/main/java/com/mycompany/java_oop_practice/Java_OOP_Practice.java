package com.mycompany.java_oop_practice;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Java_OOP_Practice {

    static class Person {

        private String name;

        public Person() {
        }

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        boolean hasSameName(Person n) {
            return name.equalsIgnoreCase(n.name);
        }
    }

    static class Student extends Person {

        private int studentId;

        public Student() {
        }

        Student(String name, int studentId) {
            super(name);
            this.studentId = studentId;
        }

        boolean isEqual(Student s) {
            return s.getName().equals(super.getName()) && studentId == s.studentId;
        }

        public int getStudentId() {
            return studentId;
        }

        public void setStudentId(int studentId) {
            this.studentId = studentId;
        }
    }

    static class Employee extends Person {

        private double salary;
        int x;

        public Employee() {
        }

        public Employee(double salary, String name) {
            super(name);
            this.salary = salary;
        }

        public Employee(double salary, int x, String name) {
            this(salary, name);
            this.x = x;
        }
    }

    static class AAA {

        int x;
    }

    static class BBB extends AAA {

        int y;
    }

    static class CCC extends AAA {

        int z;
    }

    public static void main(String[] args) {

        
    }

}
