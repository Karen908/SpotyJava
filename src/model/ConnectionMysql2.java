
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMysql2 {
    private String database_name = "spoty";
    private String user = "root";
    private String password = "administrador";
    private String url = "jdbc:mysql://localhost:3306/" + database_name;
    private Connection conexion = null;
    
    //creamos el metodo, para conectar java con mysql
    public Connection getConnection() {
        try {
            //obtener valor del driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //obtenemos la conexion 
            conexion = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            System.err.println("Ha ocurrido un ClassNotFoundException: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Ha ocurrido un SQLException: " + e.getMessage());
        }
        return conexion;
    }
}
