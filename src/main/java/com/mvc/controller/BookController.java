package com.mvc.controller;

import java.util.List;

import com.mvc.model.Book;
import com.mvc.model.BookDAO;

public class BookController {
        BookDAO bookDAO;

        public BookController(BookDAO bookDAO) {
                this.bookDAO = bookDAO;
        }

        public void createBook(Book book) {
                bookDAO.createBook(book);
        }

        public void selectAllBooks() {
                bookDAO.selectAllBooks();
        }

        public List<Book> findBookByTitle(String titleAnswer) {
                return bookDAO.findBookByTitle(titleAnswer);
        }

        public List<Book>  findBookByAuthor (String authorAnswer) {
                return bookDAO.findBookByAuthor(authorAnswer);
        }

        public List<Book>  findBookByGenre (String genreAnswer) {
                return bookDAO.findBookByGenre(genreAnswer);
        }

        public void updateBook(Book book){
                bookDAO.updateBook(book);
        }

        public void editBook(int idAnswer){
                bookDAO.editBook(idAnswer);
        }

        public void deleteBook(int idDelete){
                bookDAO.deleteBook(idDelete);
        }

        public void removeBook(int id){
                bookDAO.removeBook(id);
        }
}