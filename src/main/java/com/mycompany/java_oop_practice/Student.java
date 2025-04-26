package com.mycompany.java_oop_practice;

import java.util.Arrays;
import java.util.Random;

public class Student {

    private String name;
    private String city;
    private String[] courses;
    private int[] marks = new int[5];
    private int age;
    private String college;
    private int id;
    private static int count = 0;
    private static int count2 = 0;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String city, int age, String college, int id) {
        this.name = name;
        this.city = city;
        this.age = age;
        this.college = college;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Student.count = count;
    }

    public static int getCount2() {
        return count2;
    }

    public static void setCount2(int count2) {
        Student.count2 = count2;
    }

    void fillo() {
        Random ran = new Random();
        for (int i = 0; i < marks.length; i++) {
            marks[i] = ran.nextInt(21) + 80;
        }
        courses = new String[]{"C++", "JAVA", "PYTHON", "Dart", "GO"};

    }

    void fillo(Student s) {
        this.name = s.name;
        this.age = s.age;
        this.city = s.city;
        this.marks = s.marks;
        this.courses = s.courses;

    }

    static void fillo(Student[] arr) {
        for (Student x : arr) {
            x.fillo();
        }
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", city=" + city + ", courses=" + Arrays.toString(courses) + ", marks=" + Arrays.toString(marks) + ", age=" + age + ", college=" + college + ", id=" + id + '}';
    }

}
