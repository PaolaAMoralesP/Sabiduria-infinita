package com.mvc.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
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
            System.out.println("El nuevo libro, " + book.getTitle() + ", ha sido creado correctamente!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            DBManager.closeConnection();
        }

    }

    public void selectAllBooks() {
        try {
            connection = DBManager.initConnection();
            String sql = "SELECT * FROM books";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet result = pstmt.executeQuery();
            int count = 0;
            while (result.next()) {
                String title = result.getString("title");
                String author = result.getString("author");
                String description = result.getString("description");
                String isbn = result.getString("isbn");
                String genre = result.getString("genre");
                System.out.printf("book #%d: %s - %s - %s - %s - %s%n", ++count, title, author, description, isbn,
                        genre);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            DBManager.closeConnection();
        }
    }

    public List<Book> findBookByTitle(String titleAnswer) {

        List<Book> books = new ArrayList<>();
        try {
            connection = DBManager.initConnection();
            String sql = "SELECT * FROM public.books WHERE title ILIKE ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, "%" + titleAnswer + "%");

            ResultSet result = pstmt.executeQuery();

            while (result.next()) {
                String title = result.getString("title");
                String author = result.getString("author");
                String description = result.getString("description");
                String isbn = result.getString("isbn");
                String genre = result.getString("genre");
                System.out.printf("Book: %s - %s - %s - %s - %s%n", title, author, description, isbn, genre);

                // objeto de tipo libro y ek resul get string a traves delos seters del modelo
                // meter cada una de la info para crear el objeto y luego books.add para argegar
                // a la list y luego retur books

                // Create a new Book object and add it to the list
                Book book = new Book(title, author, description, isbn, genre);
                book.setTitle(title);
                book.setAuthor(author);
                book.setDescription(description);
                book.setIsbn(isbn);
                book.setGenre(genre);
                books.add(book);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            DBManager.closeConnection();
        }

        return books; // Return the list of books
    }


}
