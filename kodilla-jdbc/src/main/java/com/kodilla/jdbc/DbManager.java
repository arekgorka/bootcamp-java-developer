package com.kodilla.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbManager {

    private Connection conn;
    private static DbManager dbManagerInstance;

   private DbManager() throws SQLException {                                              // [3]
        Properties connectionProps = new Properties();          // [4]
        connectionProps.put("user", "kodilla_user");            // [5]
        connectionProps.put("password", "kodilla_password");     // [6]
            conn = DriverManager.getConnection(                  // [7]
                    "jdbc:mysql://localhost:3306/kodilla_course" +
                            "?serverTimezone=Europe/Warsaw" +
                            "&useSSL=False",
                    connectionProps);
    }                                                          // [15]

    public static DbManager getInstance() throws SQLException {
       if (dbManagerInstance == null) {
           dbManagerInstance = new DbManager();
       }
        return dbManagerInstance;                 // [17]
    }                                                          // [18]

    public Connection getConnection() {                        // [19]
        return conn;                                            // [20]
    }                                                          // [21]
}
