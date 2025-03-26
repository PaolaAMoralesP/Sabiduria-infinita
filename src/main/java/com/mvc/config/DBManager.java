package com.mvc.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBManager {
    private static final String URL = "jdbc:postgresql://localhost:5432/sabiduria-infinita";
    private static final String USER = "postgres";
    private static final String PASS = "mWFyaWE=";

    private static Connection connection;

    public static Connection initConnection(){
        try {
            connection = DriverManager.getConnection(URL, USER, PASS);
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

