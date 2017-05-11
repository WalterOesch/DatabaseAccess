package ch.oesch;

import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException {
        Db.driver = "jdbc:oracle:thin";
        Db.host = "localhost";
        Db.port = "1521";
        Db.catalog = "xe";
        Db.password = "1234";
        Db.username = "LOPPIS";
        ResultSet rs = Db.execute("SELECT ID, BP_ABK FROM RCS_TELEGRAMM");
        while (rs.next()) {
            int x = rs.getInt("ID");
            String s = rs.getString("BP_ABK");
            int i = 0;
        }
    }
}
