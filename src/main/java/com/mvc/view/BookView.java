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
            "Aquí irá nuestro menú. Seleciona:\n\t1. Crear un libro\n\t2. Ver listado de libros\n\t3. Buscar un libro\n \t4. Editar un libro\n\t5. Eliminar un libro\nEscribe tu respuesta:\n");
            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();
            
            switch(answer){
                case 1:
                    System.out.println("\nHas elegido la opción 1: Crear libro\n");
                    createBook();
                    break;
                case 2:
                    System.out.println("\nHas elegido la opción 2: Ver todos los libros\n");
                    selectAllBooks();
                    break;
                case 3:
                    System.out.println("\nHas elegido la opción 3: Buscar un libro\n");
                    System.out.println("\nQuieres buscar por: \n\t1.Titulo \n\t2. Autor \n\t3.Genero");
                    int searchAnswer = scanner.nextInt();
                    searchChoice(searchAnswer);
                    break;
                case 4:
                    System.out.println("\nHas elegido la opción 4: Modificar un libro\n");
                    editBook();
                    break;
                case 5:
                    System.out.println("\nHas elegido la opción 5: Borrar un libro\n");
                    deleteBook();
                    break;
                default:
                    System.out.println("Error");
            }
            scanner.close();
        }

        public void selectAllBooks () {
            bookController.selectAllBooks();
        }
        
    public void createBook (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el título del libro\n");
        String title = scanner.nextLine();
        System.out.println("Ingrese el autor del libro\n");
        String author = scanner.nextLine();
        System.out.println("Ingrese la descripción del libro\n");
        String description = scanner.nextLine();
        System.out.println("Ingrese ISBN del libro\n");
        String isbn = scanner.nextLine();
        System.out.println("Ingrese el género del libro\n");
        String genre = scanner.nextLine();
    
        Book book = new Book (title, author, description, isbn, genre);
        bookController.createBook(book);
        scanner.close();
    }

    public void searchChoice (int searchAnswer){
        switch(searchAnswer){
            case 1:
            System.out.println("Has elegido buscar por titulo");
            Scanner scannerTitle = new Scanner(System.in);
            System.out.println("Escribe tu búsqueda:");
            String titleAnswer = scannerTitle.nextLine();
            System.out.println("Has buscado "+titleAnswer);
            bookController.findBookByTitle(titleAnswer);
            scannerTitle.close();
            break;
        case 2:
            System.out.println("Has elegido buscar por autor");
            System.out.println("Escribe tu búsqueda:");
            Scanner scannerAuthor = new Scanner(System.in);
            String authorAnswer = scannerAuthor.nextLine();
            System.out.println("Has buscado "+authorAnswer);
            bookController.findBookByAuthor(authorAnswer);
            scannerAuthor.close();
            break;
        case 3:
            System.out.println("Has elegido buscar por genero");
            System.out.println("Escribe tu búsqueda:");
            Scanner scannerGenre = new Scanner(System.in);
            String genreAnswer = scannerGenre.nextLine();
            System.out.println("Has buscado "+genreAnswer);
            bookController.findBookByGenre(genreAnswer);
            scannerGenre.close();
            break;
        default:
            System.out.println("Error");
    }
    }

    public void searchByTitle(String titleAnswer){
   }

   public void searchByAuthor(String authorAnswer){
   }

   public void searchByGenre(String genreAnswer){
   }

   public void updateBook(int idAnswer){  
   }

   public void editBook(){
        Scanner scannerEdit = new Scanner(System.in);
        System.out.println("Lista actual de libros:");
        bookController.selectAllBooks();
        System.out.println("Ingresa ID:");
        int idAnswer = scannerEdit.nextInt();
        scannerEdit.nextLine();
        System.out.println("Nuevo título:");
        String title = scannerEdit.nextLine();
        System.out.println("Nuevo autor:");
        String author = scannerEdit.nextLine();
        System.out.println("Nueva descripción:");
        String description = scannerEdit.nextLine();
        System.out.println("Nuevo ISBN:");
        String isbn = scannerEdit.nextLine();
        System.out.println("Nuevo género:");
        String genre = scannerEdit.nextLine();
        Book updatedBook = new Book(title, author, description, isbn, genre);
        updatedBook.setId(idAnswer);
        bookController.updateBook(updatedBook);
        scannerEdit.close();
   }

   public void deleteBook (){
    Scanner scannerDelete = new Scanner(System.in);
    System.out.println("Lista actual de libros:");
    bookController.selectAllBooks();
    System.out.println("Ingresa ID:");
    int id = scannerDelete.nextInt();
    bookController.removeBook (id);
    scannerDelete.close();
   }
}

