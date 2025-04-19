package com.johndomnicgeorge.projects.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {

    private static String url = "jdbc:mysql://localhost:3306/todo";
    private static String username = "root";
    private static String password = "root";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException sqle) {
            System.out.println("SQL exception");
            sqle.printStackTrace();
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Class not found");
            cnfe.printStackTrace();
        } catch (Exception e) {
            System.out.println("Other exception");
            e.printStackTrace();
        }
        return connection;
    }
}
