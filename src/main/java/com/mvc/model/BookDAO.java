package com.mvc.model;


import java.sql.Connection;
import java.sql.Statement;

import com.mvc.config.DBManager;

public class BookDAO {
    
    public void createBook(Book book) {
        try {
            Connection connection = DBManager.initConnection();
            Statement stmn = connection.createStatement();
            String sql = "INSERT INTO books (title, author, description, isbn, genre) VALUES ('" + book.getTitle() + "', '"+ book.getAuthor() + "', '" + book.getDescription() + "', '" + book.getIsbn() + "', '" + book.getGenre() ;
            stmn.executeUpdate(sql);
            System.out.println("Libro creado correctamente!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            DBManager.closeConnection();
        }

    } 

}
