package com.example.tienda_classe.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDatos {
    public static void main(String[] args) throws SQLException {
        Connection dbConnection=null;
        try{
            dbConnection= DriverManager.getConnection("jdbc:mysql://localhost:3306/","root", "R4inb0wGr455");
            System.out.println("Conexión ha sido establecida");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}