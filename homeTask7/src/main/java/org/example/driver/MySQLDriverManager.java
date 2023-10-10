package org.example.driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLDriverManager {
    private static MySQLDriverManager instance;
    private static String URL = "jdbc:mysql://localhost:3306/table2";
    private static String USERNAME = "root";
    private static String PASSWORD = "Q7571918_w";

    private MySQLDriverManager() {
        init();
    }

    private void init() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
        } catch (Exception ex) {
            System.out.println("Exception loading driver...");
        }
    }

    public static MySQLDriverManager getInstance() {
        if (instance == null) {
            instance = new MySQLDriverManager();
        }
        return instance;
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}