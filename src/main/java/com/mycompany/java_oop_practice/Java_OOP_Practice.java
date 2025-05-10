package com.mycompany.java_oop_practice;

import java.util.Arrays;
import java.util.Random;

public class Java_OOP_Practice {

    static class Laptop {

        int price;
        String brand;

        public Laptop() {
        }

        public Laptop(String brand, int price) {
            this.price = price;
            this.brand = brand;
        }

        @Override
        public String toString() {
            return "Laptop{" + "price=" + price + ", brand=" + brand + '}';
        }

    }

    static Laptop[] getMaxThreeLaptops(Laptop[] arr, String br) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].brand.equalsIgnoreCase(br)) {
                count++;
            }
        }
        Laptop v[] = new Laptop[Math.min(count, 3)];//3
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j].price < arr[j + 1].price) {
                    Laptop l = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = l;
                }
            }
        }
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].brand.equalsIgnoreCase(br)) {
                v[c++] = arr[i];
            }
            if (c == v.length) {
                break;
            }
        }
        return v;
    }

    static class Rec {

    }

    static class Cir {

    }

    static class Tri {

    }

    static Object[] sortByClasses(Object arr[]) {
        Object[] temp = new Object[arr.length];
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Rec) {
                temp[c++] = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Cir) {
                temp[c++] = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Tri) {
                temp[c++] = arr[i];
            }
        }
        return temp;
    }

    public static void main(String[] args) {

//        Car r = new Car("red", 1000, 5, new Engine(2000, 2001));
//        System.out.println(r);
//        
//        Car r2 = new Car("red", 1000, 5);
//        r2.addEngine(5000, 2025);
//        
//        Car r3 = new Car("red", 1000, 5);
//        r3.addEngine(new Engine(1000, 2000));
//        
//        Car arr[] = new Car[3];
        CarCo arr[] = new CarCo[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new CarCo("red" + i, 1000, (i + 1) * 10);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        arr[1].addEngine(200, 2025);
        System.out.println("****");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
