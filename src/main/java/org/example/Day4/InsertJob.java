package org.example.Day4;

import java.sql.*;
import java.util.Scanner;

public class InsertJob {
    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);
        String url = "C:\\Users\\dev\\IdeaProjects\\Day4\\src\\main\\java\\org\\example\\hr.db";
        String query = "insert into job values (?,?,?,?)";


    /*

        prepareStatement st = conn.prepareStatement(query);
        System.out.println("Enter Job ID");
        int jobId -sc.nextInt();
     */
        {
            try (Connection conn = DriverManager.getConnection(url);) {
                PreparedStatement st = conn.prepareStatement(query);


                System.out.println("Enter Job Title");
                String job_title = sc.nextLine();
                st.setString(1, job_title);

                System.out.println("Enter Job ID");
                int job_id = sc.nextInt();
                st.setInt(2, job_id);


                System.out.println("Enter Job min Salary");
                double min_salary = sc.nextDouble();
                st.setDouble(3, min_salary);

                System.out.println("Enter Max Salary");
                double max_salary = sc.nextDouble();
                st.setDouble(4, max_salary);

                int rows = st.executeUpdate();
                System.out.println(rows + "inserted");

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }


    }

}
