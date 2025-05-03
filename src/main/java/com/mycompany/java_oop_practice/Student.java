package com.mycompany.java_oop_practice;

import java.util.Arrays;
import java.util.Random;

public class Student {

    private String name;
    private String city;
    private String[] courses = {"C++", "JAVA", "PYTHON", "Dart", "GO"};
    private int[] marks = new int[5];
    private int age;
    private String college;
    private int id;
    private static int count = 0; //eng
    private static int count2 = 0; //it

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String city, int age, String college) {
        this.name = name;
        this.city = city;
        this.age = age;
        this.college = college;
        if ("eng".equalsIgnoreCase(college)) {//5000
            id = ++count + 5000;
        } else if ("it".equalsIgnoreCase(college)) {//6000
            id = ++count2 + 6000;
        }
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

    public int getMarks(int index) {
        return marks[index];
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

    double avg() {
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        return sum / 5.0;
    }

    int maxo() {
        int max = marks[0];
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > max) {
                max = marks[i];
            }
        }
        return max;
    }

    static int maxo(Student s) {
        int max = s.marks[0];
        for (int i = 0; i < s.marks.length; i++) {
            if (s.marks[i] > max) {
                max = s.marks[i];
            }
        }
        return max;
    }

    static int maxo(Student[] arr) {
        int max = arr[0].marks[0];
        for (int i = 0; i < arr.length; i++) {
            int x = maxo(arr[i]);
            if (x > max) {
                max = x;
            }
        }
        return max;
    }

    boolean fromTulkarm() {
        return "tulkarm".equalsIgnoreCase(city);
    }

    boolean fromCity(String city) {
        if (city == null) {
            return false;
        }
        return city.equalsIgnoreCase(this.city);
    }

    static String[] listOfHero(Student[] arr) {
        String temp[] = new String[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].marks.length; j++) {
                sum += arr[i].marks[j];
            }
            double avg = sum / 5.0;
            if (avg > 90) {
                temp[count++] = arr[i].name;
            }
        }

        String[] res = new String[count];
        for (int i = 0; i < count; i++) {
            res[i] = temp[i];
        }
        return res;
    }

    void addMark(String course, int mark) {//Dart , 80
        for (int i = 0; i < courses.length; i++) {
            if (courses[i].equalsIgnoreCase(course)) {
                marks[i] = mark;
                break;
            }
        }
    }

   static void sortByName(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j].name.compareTo(arr[j + 1].name) > 0) {
                    Student temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", city=" + city + ", courses=" + Arrays.toString(courses) + ", marks=" + Arrays.toString(marks) + ", age=" + age + ", college=" + college + ", id=" + id + '}';
    }

}
