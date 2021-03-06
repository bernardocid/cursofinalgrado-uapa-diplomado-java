package org.cursofinalgrado.uapa.java.servlet.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Coneccion {
  
    
    private static void setDriver(){

        //Cargar el driver de mysql
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found");
        }
    }
    
    public static Connection getConeccion(){
        
         setDriver();
         
        //Establish connection to MySQL database
        String connectionURL = "jdbc:mysql://127.0.0.1/tallerjavadb";
        Connection connection=null;

        try {
            connection = DriverManager.getConnection(connectionURL, "root", "rootweb");
        } catch (SQLException e) {
            System.out.println("Connection failed !!!");
        }
        
        return connection;
    }
    
}
