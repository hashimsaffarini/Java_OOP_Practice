package com.mycompany.java_oop_practice;

public class Car {

    String color;
    int price;
    int id;

    Engine e;//null

    public Car(String color, int price, int id) {
        this.color = color;
        this.price = price;
        this.id = id;
    }

    public Car(String color, int price, int id, Engine e) {
        this(color, price, id);
        this.e = e;
    }

    public Car(String color, int price, int id, int power, int year) {
        this(color, price, id);
        e = new Engine(power, year);
    }

    void addEngine(int power, int year) {
        e = new Engine(power, year);
    }

    void addEngine(Engine e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return "Car{" + "color=" + color + ", price=" + price + ", id=" + id + ", e=" + e + '}';
    }

}
