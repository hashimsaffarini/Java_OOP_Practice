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

    static void getMax(Book[] arr) {
        CookBook maxBook = null;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof CookBook) {//casting
                CookBook cb = (CookBook) arr[i];
                if (maxBook == null || cb.getNumberOfRecipes() > maxBook.getNumberOfRecipes()) {
                    maxBook = cb;
                }
            }
        }
        if (maxBook == null) {
            System.out.println("No CookBook Objects in array");
        } else {
            System.out.println(maxBook);
        }
    }

    static void sortBySpeed(Vehicle[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                int speed1 = getSpeed(arr[j]);
                int speed2 = getSpeed(arr[j + 1]);
                if (speed1 > speed2) {
                    Vehicle temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static int getSpeed(Vehicle v) {
        if (v instanceof Car2) {
            return ((Car2) v).speed;
        } else if (v instanceof Motorcycle) {
            return ((Motorcycle) v).speed;
        } else {
            return Integer.MIN_VALUE;
        }
    }

    
    
    
    
    
    public static void main(String[] args) {

        Book arr[] = {
            new CookBook(4, "a", 10, 18),
            new TextBook("arabic", 10, "aa", 10, 10),
            new TextBook("arabic", 10, "aa", 10, 4),
            new CookBook(2, "a", 10, 11),
            new TextBook("arabic", 10, "aa", 10, 20),
            new CookBook(10, "a", 10, 1)
        };

        getMax(arr);

        Vehicle arr2[] = {
            new Motorcycle(20),
            new Car2(5),
            new Truck(2),
            new Car2(1),
            new Motorcycle(9)};

        sortBySpeed(arr2);

    }

}
