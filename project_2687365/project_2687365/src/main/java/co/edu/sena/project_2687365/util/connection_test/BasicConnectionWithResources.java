package co.edu.sena.project_2687365.util.connection_test;

import java.sql.*;
public class BasicConnectionWithResources
    {
        public static void main(String[] args)
        {
            String url = "jdbc:mysql://localhost:3307/Mafe?serverTimezone=America/Bogota";
            String username = "root";
            String password = "";
            String sql = "SELECT * FROM Mafe.users_tbl";
            try (Connection conn = DriverManager.getConnection(url, username, password);
                 Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(sql)) {
                while (rs.next()) {

                    System.out.println(rs.getString("user_firstname"));

                    System.out.println(rs.getString("user_lastname"));
                }
            } catch (SQLException e) {e.printStackTrace();
            } // end try-catch
        } // main
    } // BasicConnectionWithResources

