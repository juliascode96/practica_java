
package personal;

import java.sql.*;
import java.sql.DriverManager;


public class Personal {
private static final String USERNAME= "root";
private static final String PASSWORD= "magnusbane";
private static final String CONN_STRING= "jdbc:mysql://localhost:3306/prueba?autoReconnect=true&useSSL=false";


    public static void main(String[] args) {
        Connection conn = null;
        
        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME,PASSWORD);
            System.out.println("Conexión exitosa");
            Statement stmt1 = (Statement) conn.createStatement();
            String nombre = "Berry";
            String color = "Naranja";
            String insert = "INSERT INTO prueba.gatos(gato,color) VALUES ('"+nombre+"','"+color+"')";
            stmt1.executeUpdate(insert);
            insert = "INSERT INTO prueba.gatos(gato,color) VALUES ('Alanna','Pardo')";
            stmt1.executeUpdate(insert);
            System.out.println("Actualizada");
        } catch (SQLException e) {
            System.out.println("Fallo en la conexión");
            e.printStackTrace();
        }
    }
    
}
