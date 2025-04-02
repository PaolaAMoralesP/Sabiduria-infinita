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
            "Aquí irá nuestro menú. Seleciona:\n1. Crear un libro\n2. Ver listado de libros\n3. Buscar un libro\n4. Editar un libro\n 5. Eliminar un libro\nEscribe tu respuesta:");
            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();
            
            switch(answer){
                case 1:
                    System.out.println("Has elegido la opción 1");
                    createBook();
                    break;
                case 2:
                    System.out.println("Has elegido la opción 2");
                    selectAllBooks();
                    break;
                case 3:
                    System.out.println("Has elegido la opción 3");
                    System.out.println("Quieres buscar por: \n1.Titulo \n2. Autor \n3.Genero");
                    int searchAnswer = scanner.nextInt();
                    searchChoice(searchAnswer);
                    searchByTitle(null);
                    break;
                case 4:
                    System.out.println("Has elegido la opción 4");
                    break;
                case 5:
                    System.out.println("Has elegido la opción 5");
                    break;
                default:
                    System.out.println("Error");
            }
            scanner.close();
        //Create, view (+filter/search), edit, delete
        }


        public void selectAllBooks () {
            System.out.println("Testing!!!");
            bookController.selectAllBooks();


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
}

