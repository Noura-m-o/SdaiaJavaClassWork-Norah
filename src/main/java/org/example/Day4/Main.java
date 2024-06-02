package org.example.Day4;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
    String url = "C:\\Users\\dev\\IdeaProjects\\Day4\\src\\main\\java\\org\\example\\hr.db";
    String query = "select from * jobs";

    try (Connection conn = DriverManager.getConnection(url);){



        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(query);

        while (rs.next()){

            Jobs j = new Jobs(rs);
            System.out.println(j);


        }

    }
    }
}