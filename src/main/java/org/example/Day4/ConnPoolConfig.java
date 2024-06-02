package org.example.Day4;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnPoolConfig {

    private static String url =" C:\\Users\\dev\\IdeaProjects\\project1011\\src\\main\\java\\org\\example\\Day4\\hr.db";

    private static HikariConfig config = new HikariConfig();

    private static HikariDataSource ds;

    static {

        config.setJdbcUrl(url);
      //  config.addDataSourceProperty("");
        ds = new HikariDataSource(config);
    }
    public static Connection getConnection() throws SQLException {

        return ds.getConnection();
    }
}

