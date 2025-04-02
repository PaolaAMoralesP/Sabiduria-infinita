package com.mvc;

import com.mvc.controller.BookController;
import com.mvc.model.BookDAO;
import com.mvc.view.BookView;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WelcomeLibrary.printWelcomeMessage() ;
        System.out.println( "Sabiduria-infinita" );
        BookDAO model = new BookDAO();
        BookController bookController = new BookController(model);
        BookView bookView = new BookView(bookController);
        bookView.showMenu();               
    }
}