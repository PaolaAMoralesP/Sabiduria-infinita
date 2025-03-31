package com.mvc.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.mvc.config.DBManager;

public class BookDAO {

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

}
