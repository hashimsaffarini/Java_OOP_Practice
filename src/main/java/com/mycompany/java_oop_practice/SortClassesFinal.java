
package com.mycompany.java_oop_practice;


public class SortClassesFinal {

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

}
