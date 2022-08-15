package com.example.deletealgorithm;

import org.springframework.beans.factory.annotation.Value;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class rowDelete {
    /*@Value(value = "spring.datasource.url")
    String jdbcUrl;

    public void recordDelete(){
        String username = "root";
        String password = "qwer1234";
        String sql = "delete from student where id=5";

        try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
             Statement stmt = conn.createStatement();) {

            stmt.executeUpdate(sql);
            System.out.println("Record deleted successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }*/

}
