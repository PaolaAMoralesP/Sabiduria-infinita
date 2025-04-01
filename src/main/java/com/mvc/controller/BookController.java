package com.mvc.controller;
import com.mvc.model.Book;
import com.mvc.model.BookDAO;
//import com.mvc.view.BookView;

public class BookController {
 BookDAO bookDAO;

 public BookController(BookDAO bookDAO){
    this.bookDAO = bookDAO;
 }
 public void createBook(Book book){
        bookDAO.createBook(book);

    }
 public void selectBook() {
        bookDAO.selectBook;
}
}