package com.mvc;

// import com.mvc.config.DBManager;
import com.mvc.model.Book;
import com.mvc.model.BookDAO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Sabiduria-infinita" );
        // DBManager.initConnection();
        // DBManager.closeConnection();

        Book firstBook = new Book("The Great Gatsby", "F. Scott Fitzgerald", "A novel about the American Dream", "9780743273565", "Fiction");
        System.out.println(firstBook.getId());

        BookDAO model = new BookDAO();
        model.createBook(firstBook);
    }




}
