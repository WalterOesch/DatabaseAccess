package ch.oesch;

import java.sql.*;

public class Db {
    private static final String oracleThinConnectionString = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String sqlServerEpressConnectionString2 = "jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=abc;integratedSecurity=true";
    private static final String sqlServerEpressConnectionString = "jdbc:sqlserver://" + "localhost;" + "instance=SQLEXPRESS;databaseName=walter_test;user=walter;password=1234";
    private static final String mysqlConnectionString = "jdbc:mysql://localhost/test?";


    public static String connectionString = null;
    public static String username;
    public static String password;

    public static ResultSet execute(String query){
        ResultSet rs = null;
        if(connectionString == null) {
            return rs;
        }

        try {
            Connection con = DriverManager.getConnection(
                    connectionString,
                    username,
                    password);

            Statement stmt = con.createStatement();
            rs = stmt.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  rs;
    }
}