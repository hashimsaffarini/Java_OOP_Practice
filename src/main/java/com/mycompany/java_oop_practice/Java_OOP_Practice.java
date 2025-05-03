package com.mycompany.java_oop_practice;

import java.util.Arrays;
import java.util.Random;

public class Java_OOP_Practice {

    static String generatePalindrome(String s) {
        int freq[] = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        int oddCount = 0;
        char oddChar = 0;

        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 != 0) {
                oddCount++;
                oddChar = (char) (i + 'a');
            }
        }
        if (oddCount > 1) {
            return "NO PALINDROME";
        }
        StringBuilder firstHalf = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < freq[i] / 2; j++) {
                firstHalf.append((char) (i + 'a'));
            }
        }//aab
        StringBuilder secHalf = new StringBuilder(firstHalf).reverse();
        //baa
        if (oddCount == 1) {
            return firstHalf.toString() + oddChar + secHalf.toString();
        } else {
            return firstHalf.toString() + secHalf.toString();
        }
    }

    public static void main(String[] args) {

        Student s = new Student();
        s.fillo();
        System.out.println(s.fromTulkarm());
        System.out.println(s.fromCity(null));
        Student r = new Student();
        r.fillo();
        System.out.println(s);
        System.out.println(r);
        Random ran = new Random();
        Student arr[] = new Student[6];
        String names[] = {"ahmed", "hanan", "ali", "hashim", "omar", "bb"};
//        for (int i = 0; i < arr.length; i++) {
//            int x = ran.nextInt(names.length);//0-4
//            if (i % 2 == 0) {
//                arr[i] = new Student(names[x], "s", 2, "it");
//            } else {
//                arr[i] = new Student(names[x], "s", 2, "eng");
//            }
//        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Student(names[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getName());
        }
        Student.sortByName(arr);
        System.out.println("*****");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getName());
        }

    }

}
