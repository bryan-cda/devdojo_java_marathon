package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SimpleConnection {
    public static String url = "jdbc:postgresql://172.17.0.4:5432/jsp";
    public static String user = "postgres";
    public static String password = "root";
    public static Connection connection = null;
    public static Boolean isConnected = false;

   static { getConnection(); }

   public SimpleConnection(){ getConnection(); }

    public static Boolean getStatusConnection(){
        try {
            if(connection == null) {
                Class.forName("org.postgresql.Driver");
                connection = DriverManager.getConnection(url,user,password);
                connection.setAutoCommit(false);
                isConnected = true;
            }
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
            throw new RuntimeException("Erro ao tentar conectar no banco de dados");
        }
        return isConnected;
    }

    public static Connection getConnection(){
        try{
            if(connection == null) {
                Class.forName("org.postgresql.Driver");
                connection = DriverManager.getConnection(url,user,password);
                connection.setAutoCommit(false);
                isConnected = true;
            }
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
            throw new RuntimeException("Erro ao tentar conectar no banco de dados");
        }
        return connection;
    }

}
