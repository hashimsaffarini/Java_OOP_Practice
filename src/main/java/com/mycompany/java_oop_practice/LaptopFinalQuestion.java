
package com.mycompany.java_oop_practice;


public class LaptopFinalQuestion {

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
}
