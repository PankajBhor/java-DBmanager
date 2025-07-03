package com.tap.pankaj.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class jdbcalter_demo {

    public static void jdbcalter() {
        // credential definationString db;
        String db;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the database you want to use: ");
        db = sc.next();
        String url = "jdbc:mysql://localhost:3306/" + db;
        String username = "root";
        String password = "password";
        System.out.println("Enter the table name:");
        String tableName = sc.next();
        System.out.println("What you want to alter(Add, Modify, Drop column): ");
        String alterType = sc.next();
        System.out.println("Enter the column name: ");
        String colName = sc.next();
        System.out.println("Enter datatype(int, varchar, datetime, etc): ");
        String dataType= sc.next();
        System.out.println("Enter size: ");
        int size=sc.nextInt();
        System.out.println("Selected Database: "+db+"\nTable Name: "+tableName+"\nOperation: "+alterType+"\nColumn Name: "+colName+"\nDatatype: "+dataType+"\nSize: "+size);
        String alter = "ALTER TABLE "+tableName+" "+alterType+" COLUMN "+colName+" "+dataType+"("+size+")"+";";
        // exception handling for connection and execution block
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection successfull");
            Statement stmt = con.createStatement();
            // to get the column names
            stmt.execute(alter);
            stmt.close();
            con.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
