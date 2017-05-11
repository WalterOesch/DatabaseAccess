package ch.oesch;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        String username = "LOPPIS";
        String password = "1234";
        connectToAndQueryDatabase(username, password);
    }


    public static void connectToAndQueryDatabase(String username, String password) {

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe",
                    username,
                    password);

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT ID, BP_ABK FROM RCS_TELEGRAMM");

            while (rs.next()) {
                int x = rs.getInt("ID");
                String s = rs.getString("BP_ABK");
                int i = 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
