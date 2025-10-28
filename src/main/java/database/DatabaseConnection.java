/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
  private static final String URL =
       "jdbc:sqlserver://DESKTOP-VC92P42;databaseName=StudentManagementDB;encrypt=false;trustServerCertificate=true";

    private static final String USER = "khang";
    private static final String PASSWORD = "12345qwert";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
