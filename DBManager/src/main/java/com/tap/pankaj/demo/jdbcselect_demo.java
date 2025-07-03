package com.tap.pankaj.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class jdbcselect_demo {
    public static void jdbcselect() {
        //credential definationString db;
        String db;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the database you want to use: ");
        db=sc.next();
        String url = "jdbc:mysql://localhost:3306/"+db;
        String username = "root";
        String password = "password";
        String select = "SELECT * FROM employees;";
        //exception handling for connection and execution block
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection successfull");
            Statement stmt = con.createStatement();
            //to get the column names
            ResultSet rs = stmt.executeQuery(select);
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                System.out.printf("%-20s", rsmd.getColumnName(i));
            }
            System.out.println();
            System.out.println("--------------------------------------------------------------------------------------------------------------");
            //to print the reccords
            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.printf("%-20s", rs.getString(i));
                }
                System.out.println();
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}