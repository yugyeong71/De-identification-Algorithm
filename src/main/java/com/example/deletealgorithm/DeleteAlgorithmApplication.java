package com.example.deletealgorithm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@SpringBootApplication
public class DeleteAlgorithmApplication {

    static final String jdbcUrl = "jdbc:mariadb://localhost:3306/student";

    public static void main(String[] args) throws ClassNotFoundException{
        SpringApplication.run(DeleteAlgorithmApplication.class, args);


        try {
            //Class.forName("com.mysql.jdbc.Driver");

            Connection conn = DriverManager.getConnection(
                    jdbcUrl, "root", "qwer1234");

            Statement stmt = conn.createStatement();

            String query
                    = "ALTER TABLE student Drop name";

            int result = stmt.executeUpdate(query);

            if (result > 0)
                System.out.println(
                        "A column from the table is deleted.");
            else
                System.out.println("unsuccessful deletion ");

            conn.close();
        }

        catch (SQLException e) {

            System.out.println(e);
        }
    }
}
