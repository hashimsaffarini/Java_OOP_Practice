package com.mycompany.java_oop_practice;

public class TextBook extends Book {

    private String subject;
    private int numberOfChapters;

    public TextBook(String subject, int numberOfChapters, String title, int year, int cost) {
        super(title, year, cost);
        this.subject = subject;
        this.numberOfChapters = numberOfChapters;
    }

    @Override
    public String toString() {
        return "TextBook{" + "subject=" + subject + ", numberOfChapters=" + numberOfChapters + '}';
    }

}
