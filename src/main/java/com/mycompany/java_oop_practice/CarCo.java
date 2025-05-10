package com.mycompany.java_oop_practice;

import java.util.Arrays;

public class CarCo {

    String color;
    int price;
    int id;

    Engine[] eng = new Engine[3];
    int count;

    public CarCo(String color, int price, int id) {
        this.color = color;
        this.price = price;
        this.id = id;
    }

    public CarCo(String color, int price, int id, Engine e) {
        this(color, price, id);
        addEngine(e);
    }

    public CarCo(String color, int price, int id, int power, int year) {
        this(color, price, id);
        addEngine(power, year);
    }

    void addEngine(int power, int year) {
        if (isCanAddEngine()) {
            eng[count++] = new Engine(power, year);
        } else {
            System.out.println("Full Array");
        }
    }

    void addEngine(Engine e) {
        if (isCanAddEngine()) {
            eng[count++] = e;
        } else {
            System.out.println("Full Array");
        }
    }

    boolean isCanAddEngine() {
        return count != eng.length;
    }

    @Override
    public String toString() {
        return "CarCo{" + "color=" + color + ", price=" + price + ", id=" + id + ", eng=" + Arrays.toString(eng) + ", count=" + count + '}';
    }

   

}
