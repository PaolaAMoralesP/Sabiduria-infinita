package com.mvc.view;

import java.util.Scanner;
import com.mvc.controller.BookController;
import com.mvc.model.Book;
import static com.mvc.WelcomeLibrary.*; 

public class BookView {
    private BookController bookController;
    private Scanner scanner;

    public BookView(BookController bookController) {
        this.bookController = bookController;
        this.scanner = new Scanner(System.in);
    }

    public void showMenu() {
        System.out.println(ANSI_CYAN + "\n════════════════ MENÚ PRINCIPAL ════════════════" + ANSI_RESET);
        System.out.println(ANSI_PURPLE + "\t1. Crear un libro\n\t2. Ver listado de libros\n\t3. Buscar un libro\n" +
                "\t4. Editar un libro\n\t5. Eliminar un libro" + ANSI_RESET);
        System.out.print(ANSI_CYAN + "Escribe tu respuesta: " + ANSI_RESET);
        
        int answer = scanner.nextInt();
        scanner.nextLine();
        switch (answer) {
            case 1:
                System.out.println(ANSI_PURPLE + "\nHas elegido la opción 1: Crear libro" + ANSI_RESET);
                createBook();
                break;
            case 2:
                System.out.println(ANSI_PURPLE + "\nHas elegido la opción 2: Ver todos los libros" + ANSI_RESET);
                selectAllBooks();
                break;
            case 3:
                System.out.println(ANSI_PURPLE + "\nHas elegido la opción 3: Buscar un libro" + ANSI_RESET);
                System.out.println("Quieres buscar por: \n\t1.Título \n\t2. Autor \n\t3.Género");
                int searchAnswer = scanner.nextInt();
                scanner.nextLine();
                searchChoice(searchAnswer);
                break;
            case 4:
                System.out.println(ANSI_PURPLE + "\nHas elegido la opción 4: Modificar un libro" + ANSI_RESET);
                editBook();
                break;
            case 5:
                System.out.println(ANSI_PURPLE + "\nHas elegido la opción 5: Borrar un libro" + ANSI_RESET);
                deleteBook();
                break;
            default:
                System.out.println(ANSI_RED + "Error: Opción no válida" + ANSI_RESET);
        }
    }

    public void selectAllBooks() {
        bookController.selectAllBooks();
    }

    public void createBook() {
        System.out.print(ANSI_CYAN + "Ingrese el título del libro: " + ANSI_RESET);
        String title = scanner.nextLine();
        System.out.print(ANSI_CYAN + "Ingrese el autor del libro: " + ANSI_RESET);
        String author = scanner.nextLine();
        System.out.print(ANSI_CYAN + "Ingrese la descripción del libro: " + ANSI_RESET);
        String description = scanner.nextLine();
        System.out.print(ANSI_CYAN + "Ingrese ISBN del libro: " + ANSI_RESET);
        String isbn = scanner.nextLine();
        System.out.print(ANSI_CYAN + "Ingrese el género del libro: " + ANSI_RESET);
        String genre = scanner.nextLine();
        
        Book book = new Book(title, author, description, isbn, genre);
        bookController.createBook(book);
    }

    public void searchChoice(int searchAnswer) {
        System.out.print(ANSI_CYAN + "Escribe la búsqueda: " + ANSI_RESET);
        String query = scanner.nextLine();
        
        switch (searchAnswer) {
            case 1:
                bookController.findBookByTitle(query);
                break;
            case 2:
                bookController.findBookByAuthor(query);
                break;
            case 3:
                bookController.findBookByGenre(query);
                break;
            default:
                System.out.println(ANSI_RED + "Error: Opción no válida" + ANSI_RESET);
        }
    }

    public void editBook() {
        System.out.println("Lista actual de libros:");
        bookController.selectAllBooks();
        System.out.print(ANSI_CYAN + "Ingresa ID del libro a modificar: " + ANSI_RESET);
        int idAnswer = scanner.nextInt();
        scanner.nextLine();
        System.out.print(ANSI_CYAN + "Nuevo título: " + ANSI_RESET);
        String title = scanner.nextLine();
        System.out.print(ANSI_CYAN + "Nuevo autor: " + ANSI_RESET);
        String author = scanner.nextLine();
        System.out.print(ANSI_CYAN + "Nueva descripción: " + ANSI_RESET);
        String description = scanner.nextLine();
        System.out.print(ANSI_CYAN + "Nuevo ISBN: " + ANSI_RESET);
        String isbn = scanner.nextLine();
        System.out.print(ANSI_CYAN + "Nuevo género: " + ANSI_RESET);
        String genre = scanner.nextLine();
        
        Book updatedBook = new Book(title, author, description, isbn, genre);
        updatedBook.setId(idAnswer);
        bookController.updateBook(updatedBook);
    }

    public void deleteBook() {
        System.out.println("Lista actual de libros:");
        bookController.selectAllBooks();
        System.out.print(ANSI_CYAN + "Ingresa ID del libro a eliminar: " + ANSI_RESET);
        int id = scanner.nextInt();
        bookController.removeBook(id);
    }
}
