package com.tap.pankaj.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class jdbcdelete_demo {    
    public static int rows;
    public static int jdbcdelete() {
        // credential definationString db;
        String db;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the database you want to use: ");
        db=sc.next();
        String url = "jdbc:mysql://localhost:3306/"+db;
        String username = "root";
        String password = "password";
        String delete = "DELETE FROM pankaj WHERE id=1;";
        // exception handling for connection and execution block
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection successfull");
            Statement stmt = con.createStatement();
            // to get the column names
            rows = stmt.executeUpdate(delete);
            stmt.close();
            con.close();
        } 
        catch (SQLException e) {
            System.out.println(e);
        }
        
        return rows;
    }
}