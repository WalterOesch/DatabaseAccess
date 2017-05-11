package ch.oesch;

import java.sql.*;

/**
 * Created by Walter Oesch on 11.05.2017.
 */
public class Db {
    private static final String oracleThinConnectionString = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String sqlServerEpressConnectionString2 = "jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=abc;integratedSecurity=true";
    private static final String sqlServerEpressConnectionString = "jdbc:sqlserver://" + "localhost;" + "instance=SQLEXPRESS;databaseName=walter_test;user=walter;password=1234";
    public static final String mysqlConnectionString = "jdbc:mysql://localhost/test?";

    public static String connectionString = "jdbc:oracle:thin:@localhost:1521:xe";
    public static String username;
    public static String password;

    public static ResultSet execute(String query){
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
