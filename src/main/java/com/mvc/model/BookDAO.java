package com.mvc.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import com.mvc.config.DBManager;

public class BookDAO {

    public final String selectBook = null;
    private PreparedStatement stmn;
    private Connection connection;

    public void createBook(Book book) {
        try {
            connection = DBManager.initConnection();
            String sql = "INSERT INTO books (title, author, description, isbn, genre) VALUES (?, ?, ?, ?, ?)";
            stmn = connection.prepareStatement(sql);
            stmn.setString(1, book.getTitle());
            stmn.setString(2, book.getAuthor());
            stmn.setString(3, book.getDescription());
            stmn.setString(4, book.getIsbn());
            stmn.setString(5, book.getGenre());
            stmn.executeUpdate();
            System.out.println("El nuevo libro, "+book.getTitle()+ ", ha sido creado correctamente!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            DBManager.closeConnection();
        }

    }

    public void selectAllBooks() {
        try {
            connection = DBManager.initConnection();
            String sql = "SELECT * FROM books" ;
            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet result = pstmt.executeQuery();
            int count = 0;
            while (result.next()) {
            String title = result.getString("title");
            String author = result.getString("author");
            String description = result.getString("description");
            String isbn = result.getString("isbn");
            String genre = result.getString("genre");
            System.out.printf("book #%d: %s - %s - %s - %s - %s%n", ++count, title, author, description, isbn, genre);
        } 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            DBManager.closeConnection();
        }   
    }
    
}
