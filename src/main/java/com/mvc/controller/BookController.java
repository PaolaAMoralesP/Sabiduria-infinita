package com.mvc.controller;
import com.mvc.model.Book;
import com.mvc.model.BookDAO;

public class BookController {
 BookDAO bookDAO;

 public BookController(BookDAO bookDAO){
    this.bookDAO = bookDAO;
 }
 public void createBook(Book book){
        BookDAO.createBook(book); 
    }
}
