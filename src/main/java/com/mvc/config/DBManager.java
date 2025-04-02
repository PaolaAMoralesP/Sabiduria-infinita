package com.mvc.config;

import java.sql.Connection;
import java.sql.DriverManager;

import io.github.cdimascio.dotenv.Dotenv;


public class DBManager {
    private static final Dotenv dotenv = Dotenv.load();

    private static final String URL = dotenv.get("DB_URL");
    private static final String USER = dotenv.get("DB_USER");
    private static final String PASSWORD = dotenv.get("DB_PASSWORD");

    private static Connection connection;

    public static Connection initConnection(){
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Se ha conectado con exito!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }  
        return connection;
    }
    public static void closeConnection(){
        try {
            connection.close();
            System.out.println("Conexión cerrada correctamente");
        } catch (Exception e) {
            
        }
    }
}

