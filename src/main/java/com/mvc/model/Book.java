package com.mvc.model;

public class Book {
    private int id;
    private String title;
    private String author;
    private String description;
    private String isbn;
    private String genre;

    public Book(int id, String title, String author, String description, String isbn, String genre){
        this.title = title;
        this.author = author;
        this.description = description;
        this.isbn = isbn;
        this.genre = genre;
    }
//getter
    public int getId(){
        return this.id;
    }
//setter
    public void setId(int id) {
        this.id = id;
    }
    //getter
    public String getTitle(){
        return this.title;
    }
//setter
    public void setTitle(String title) {
        this.title = title;
    }
    //getter
    public String getAuthor(){
        return this.author;
    }
//setter
    public void setAuthor(String author) {
        this.author = author;
    }
    //getter
    public String getDescription(){
        return this.description;
    }
//setter
    public void setDescription(String description) {
        this.description = description;
    }
    //getter
    public String getIsbn(){
        return this.isbn;
    }
//setter
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
