package com.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
// import java.util.Scanner;

public class MyConfig {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/tugas_database ";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "";

    private static Connection connect;

    public static void connection() {
        try {
            connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("connection gagal");

        }
    }

}
