package com.mvc.view;
import java.util.Scanner;

import com.mvc.controller.BookController;
import com.mvc.model.Book;

public class BookView {
    private BookController bookController;

    public BookView (BookController bookController){
        this.bookController = bookController;
    }
    public void createBook (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el título del libro");
        String title = scanner.nextLine();
        System.out.println("Ingrese el autor del libro");
        String author = scanner.nextLine();
        System.out.println("Ingrese la descripción del libro");
        String description = scanner.nextLine();
        System.out.println("Ingrese ISBN del libro");
        String isbn = scanner.nextLine();
        System.out.println("Ingrese el género del libro");
        String genre = scanner.nextLine();
    
        Book book = new Book (title, author, description, isbn, genre);
        bookController.createBook(book);
        scanner.close();
        
    }
}
