package ch.oesch;

import java.sql.*;

/**
 * Created by Walter Oesch on 11.05.2017.
 */
public class Db {
    private static final String oracleThinConnectionString = "jdbc:oracle:thin:@localhost:1521:xe";
    private static String connectionString = "jdbc:oracle:thin:@localhost:1521:xe";
    public static String driver = "jdbc:oracle:thin";
    public static String host = "localhost";
    public static String port = "1521";
    public static String catalog = "xe";
    public static String username;
    public static String password;

    public static ResultSet execute(String query){
        connectionString = driver + ":@" + host + ":" + port + ":" + catalog;
        ResultSet rs = null;
        try {

            Connection con = DriverManager.getConnection(
                    connectionString,
                    username,
                    password);

            Statement stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            return  rs;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  rs;
    }
}
