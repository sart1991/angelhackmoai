package com.moai.data.db;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class AppDB {

    private static AppDB instance;
    private Connection conn;

    private AppDB() {
        init();
    }

    public static AppDB get() {
        if (instance == null) instance = getSync();
        return instance;
    }

    private static synchronized AppDB getSync() {
        if (instance == null) instance = new AppDB();
        return instance;
    }

    private void init() {
        try {
            String url;

            Properties properties = new Properties();

            try {
                ClassLoader loader = AppDB.class.getClassLoader();
                InputStream in = loader.getResourceAsStream("config.properties");
                properties.load(in);
                url = properties.getProperty("sqlUrl");
            } catch (IOException e) {
                System.out.println("no property: " + e);  // Servlet Init should never fail.
                return;
            }

            System.out.println("connecting to: " + url);
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(url);
            } catch (ClassNotFoundException e) {
                System.out.println("error clase no encontrada " + e.getMessage());
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

        } finally {
            // Nothing really to do here.
        }
    }

    public Connection getConn() {
        return conn;
    }


}
