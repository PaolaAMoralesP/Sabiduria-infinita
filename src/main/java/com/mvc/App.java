package com.mvc;

import com.mvc.controller.BookController;
import com.mvc.model.BookDAO;
import com.mvc.view.BookView;

public class App 
{
    public static void main( String[] args )
    {
        WelcomeLibrary.printWelcomeMessage();
        BookDAO model = new BookDAO();
        BookController bookController = new BookController(model);
        BookView bookView = new BookView(bookController);
        bookView.showMenu();               
    }
}