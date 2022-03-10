package com.galvanize.tmo.paspringstarter;

public class Book {
    private int id;
    private String author;
    private String title;
    private int yearPublished;

    public Book(String author, String title, int yearPublished) {
        this.author = author;
        this.title = title;
        this.yearPublished = yearPublished;
    }

    public int getId() { return this.id; }
    public String getAuthor() { return this.author; }
    public String getTitle() { return this.title; }
    public int getYearPublished() { return this.yearPublished; }

    public void setId(int id) { this.id = id; }
    public void setAuthor(String author) { this.author = author; }
    public void setTitle(String title) { this.title = title; }
    public void setYearPublished(int yearPublished) { this.yearPublished = yearPublished; }
}
