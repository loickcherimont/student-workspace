/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.db;

//import com.example.config.Config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author loickcherimont
 */
public class DBConfig {

    private Connection connexion = null;
//    private String dbUser = "";
//    private String dbPassword = "";

    // Charger la base de données
    public void loadDB() {

        // Load driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loading: OK!");
        } catch (ClassNotFoundException e) {
            System.err.println("Exception: " + e.getMessage());
        }

        // Connect to DB
        try {
            connexion = DriverManager.getConnection("jdbc:mysql://localhost/sample?useSSL=true", "YOUR_DBUSERNAME", "YOUR_DBPASSWORD");
            System.out.println("Connection with DB: OK!" + connexion);
        } catch (SQLException e) {
            System.err.println("SQLException: " + e.getMessage());
            System.err.println("SQLState: " + e.getSQLState());
            System.err.println("VendorError: " + e.getErrorCode());

        }
    }
}
