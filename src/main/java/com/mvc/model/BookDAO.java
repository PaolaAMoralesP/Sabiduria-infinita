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
            // int count = 0;
            while (result.next()) {
                int id = result.getInt("id");
                String title = result.getString("title");
                String author = result.getString("author");
                String description = result.getString("description");
                String isbn = result.getString("isbn");
                String genre = result.getString("genre");
                System.out.printf("Book #%d: %s - %s - %s - %s - %s%n", id, title, author, description, isbn,
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
                int id = result.getInt("id");
                String title = result.getString("title");
                String author = result.getString("author");
                String description = result.getString("description");
                String isbn = result.getString("isbn");
                String genre = result.getString("genre");
                System.out.printf("Book #%d: %s - %s - %s - %s - %s%n", id, title, author, description, isbn,
                        genre);

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

        public List<Book> findBookByAuthor(String authorAnswer) {
        List<Book> books = new ArrayList<>();
        try {
            connection = DBManager.initConnection();
            String sql = "SELECT * FROM public.books WHERE author ILIKE ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, "%" + authorAnswer + "%");

            ResultSet result = pstmt.executeQuery();

            while (result.next()) {
                int id = result.getInt("id");
                String title = result.getString("title");
                String author = result.getString("author");
                String description = result.getString("description");
                String isbn = result.getString("isbn");
                String genre = result.getString("genre");
                System.out.printf("Book #%d: %s - %s - %s - %s - %s%n", id, title, author, description, isbn,
                        genre);

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

        return books; 
        
    }

    public List<Book> findBookByGenre(String genreAnswer) {
        List<Book> books = new ArrayList<>();
        try {
            connection = DBManager.initConnection();
            String sql = "SELECT * FROM public.books WHERE genre ILIKE ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, "%" + genreAnswer + "%");

            ResultSet result = pstmt.executeQuery();

            while (result.next()) {
                int id = result.getInt("id");
                String title = result.getString("title");
                String author = result.getString("author");
                String description = result.getString("description");
                String isbn = result.getString("isbn");
                String genre = result.getString("genre");
                System.out.printf("Book #%d: %s - %s - %s - %s - %s%n", id, title, author, description, isbn,
                        genre);

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
        return books;    
    }

    public void updateBook(Book book){
        try {
            connection = DBManager.initConnection();
            String sql = "UPDATE books SET title = ?, author = ?, description = ?, isbn = ?, genre = ? WHERE id = ?";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, book.getTitle());
            pstmt.setString(2, book.getAuthor());
            pstmt.setString(3, book.getDescription());
            pstmt.setString(4, book.getIsbn());
            pstmt.setString(5, book.getGenre());
            pstmt.setInt(6,book.getId());
            
            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
            System.out.println("✅ Libro actualizado con éxito.");
            } else {
            System.out.println("⚠️ No se encontró ningún libro con ese ID.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            DBManager.closeConnection();
        }  
         
 } 
public void removeBook(int id){
        try {
            connection = DBManager.initConnection();
            String sql = "DELETE FROM books WHERE id = ?";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1, id);
            
            // pstmt.setString(1, book.getTitle());
            // pstmt.setString(2, book.getAuthor());
            // pstmt.setString(3, book.getDescription());
            // pstmt.setString(4, book.getIsbn());
            // pstmt.setString(5, book.getGenre());
            // pstmt.setInt(6,id);


            int rowsDeleted = pstmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("✅ Libro eliminado con éxito.");
            } else {
                System.out.println("⚠️ No se encontró ningún libro con ese ID.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            DBManager.closeConnection();
        }
    }

public void editBook(int idAnswer){

}

public void deleteBook(int idDelete) {

}


}
