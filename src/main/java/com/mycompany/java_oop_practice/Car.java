package com.mycompany.java_oop_practice;

public class Car {

    int price;
    String color;

    Engine e;
    
    Car(int price, String color) {
        this.price = price;
        this.color = color;
        e = new Engine();
    }

    Car() {
        e = new Engine();
    }

}
