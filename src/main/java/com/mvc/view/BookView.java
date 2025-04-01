package com.mvc.view;
import java.util.Scanner;

import com.mvc.controller.BookController;
import com.mvc.model.Book;


public class BookView {
    private BookController bookController;

    public BookView (BookController bookController){
        this.bookController = bookController;
    }
    public void showMenu() {
        System.out.println(
            "Aquí irá nuestro menú. Seleciona:\n1. Crear un libro\n2. Buscar un libro\n3. Editar un libro\n4. Eliminar un libro\nEscribe tu repsuesta:");
            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();
            switch(answer){
                case 1:
                    System.out.println("Has elegido la opción 1");
                    createBook();
                    break;
                case 2:
                    System.out.println("Has elegido la opción 2");
                    break;
                case 3:
                    System.out.println("Has elegido la opción 3");
                    break;
                case 4:
                    System.out.println("Has elegido la opción 4");
                    break;
                default:
                    System.out.println("Error");
            }
            scanner.close();
        //Create, view (+filter/search), edit, delete
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
