package com.mycompany.java_oop_practice;

import java.util.Arrays;
import java.util.Scanner;

public class Course {

    private String courseName;
    private String[] students;
    private int numberOfStudents;

    Course(String courseName, int capacity) {//5
        this.courseName = courseName;
        students = new String[capacity];
    }

    void addStudent(String name) {
        if (isCanAddStudent()) {
            students[numberOfStudents++] = name;
        } else {
            Scanner in = new Scanner(System.in);
            int x = in.nextInt();
            if (x == 1) {
                String temp[] = new String[students.length + 1];
                for (int i = 0; i < students.length; i++) {
                    temp[i] = students[i];
                }
                temp[numberOfStudents++] = name;
                students = temp;
            }
        }
    }

    @Override
    public String toString() {
        return "Course{" + "students=" + Arrays.toString(students) + '}';
    }
    
    

    boolean isCanAddStudent() {
        return numberOfStudents != students.length;
    }

}
