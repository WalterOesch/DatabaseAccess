package ch.oesch;

import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException {
        Db.connectionString = "jdbc:oracle:thin:@localhost:1521:xe";
        Db.password = "1234";
        Db.username = "LOPPIS";
        String query = "SELECT ID, BP_ABK FROM RCS_TELEGRAMM";

        // Db.connectionString = "jdbc:mysql://localhost/test?";
        //Db.password = "1234";
        //Db.username = "walter.oesch";
        //query = "SELECT ID, NAME FROM CAR";

        ResultSet rs = Db.execute(query);
        while (rs.next()) {
            int x = rs.getInt("ID");
            //String s = rs.getString("NAME");
            String s = rs.getString("BP_ABK");
            int i = 0;
        }
    }
}
