package com.mycompany.java_oop_practice;

public class Engine {

    int power;
    int year;

    public Engine(int power, int year) {
        this.power = power;
        this.year = year;
    }

    public Engine() {
    }

    @Override
    public String toString() {
        return "Engine{" + "power=" + power + ", year=" + year + '}';
    }
    
    

}
