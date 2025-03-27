package com.mvc;

import com.mvc.config.DBManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Sabiduria-infinita" );
        DBManager.initConnection();
        DBManager.closeConnection();
    }
}
