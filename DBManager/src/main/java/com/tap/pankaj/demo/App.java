package com.tap.pankaj.demo;

import java.util.Scanner;

public class App {

    public static void main(String args[]) {
        int ch;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("****Menu for database connectivity operations****");
            System.out.println("1. Create");
            System.out.println("2. Insert");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Select");
            System.out.println("6. Truncate");
            System.out.println("7. Alter");
            System.out.println("8. Drop");
            System.out.println(">=9. Exit");
            System.out.println("Enter your choice");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    jdbccreate_demo.jdbccreate();
                    System.out.println("Table Created successfully");
                    break;
                case 2:
                    int inserted_rows = jdbcinsert_demo.jdbcinsert();
                    System.out.println("Rows inserted: " + inserted_rows);
                    System.out.println("Data inserted successfully");
                    break;
                case 3:
                    int updated_rows = jdbcupdate_demo.jdbcupdate();
                    System.out.println("Row updated: " + updated_rows);
                    System.out.println("Data updated successfully");
                    break;
                case 4:
                    int deleted_rows = jdbcdelete_demo.jdbcdelete();
                    System.out.println("Rows Deleted: " + deleted_rows);
                    System.out.println("Data Deleted successfully");
                    break;
                case 5:
                    jdbcselect_demo.jdbcselect();
                    break;
                case 6:
                    jdbctruncate_demo.jdbctruncate();
                    System.out.println("Table Truncated successfully");
                    break;
                case 7:
                    jdbcalter_demo.jdbcalter();
                    System.out.println("Table Altered successfully");
                    break;
                case 8:
                    jdbcdrop_demo.jdbcdrop();
                    System.out.println("Table Dropped successfully");
                    break;
                default:
                    System.out.println("Your changes are reflected in the database");
                    break;
            }

        } while (ch <= 8);
        sc.close();
    }
}
