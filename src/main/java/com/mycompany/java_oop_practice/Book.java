package com.mycompany.java_oop_practice;

public class Book {

    private String title;
    private int year;
    private int cost;

    public Book(String title, int year, int cost) {
        this.title = title;
        this.year = year;
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", year=" + year + ", cost=" + cost + '}';
    }

}
