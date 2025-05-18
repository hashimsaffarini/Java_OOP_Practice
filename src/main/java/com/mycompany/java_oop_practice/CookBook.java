package com.mycompany.java_oop_practice;

public class CookBook extends Book {

    private int numberOfRecipes;

    public CookBook(int numberOfRecipes, String title, int year, int cost) {
        super(title, year, cost);
        this.numberOfRecipes = numberOfRecipes;
    }

    public int getNumberOfRecipes() {
        return numberOfRecipes;
    }

    public void setNumberOfRecipes(int numberOfRecipes) {
        this.numberOfRecipes = numberOfRecipes;
    }

    @Override
    public String toString() {
        return "CookBook{" + "numberOfRecipes=" + numberOfRecipes + '}';
    }

}
