package tienda.persistencia;

import java.sql.*;
import java.sql.DriverManager;

public abstract class DAO {

    private static final String USERNAME = "root";
    private static final String PASSWORD = "magnusbane";
    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/tienda?autoReconnect=true&useSSL=false";
    protected Connection conexion = null;
    protected ResultSet resultado = null;
    protected Statement sentencia = null;

    protected void conectarBase() throws Exception {

        try {
            conexion = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            System.out.println("Conexión exitosa");
        } catch (SQLException e) {
            System.out.println("Fallo en la conexión");
            e.printStackTrace();
        }
    }
    
    protected void desconectarBase() throws Exception {
        try {
            if (resultado != null) {
                resultado.close();
            }
            if (sentencia != null) {
                sentencia.close();
            }
            if (conexion != null) {
                conexion.close();
            }
            System.out.println("Desconexión exitosa");
        } catch (Exception ex) {
            throw ex;
        }
    }
    
    protected void insertarModificarEliminar(String sql) throws Exception{
      try {
          conectarBase();
          sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
            System.out.println("Actualizada");
      } catch(SQLException e) {
          System.out.println("Ha ocurrido un error en la actualización de datos");
          e.getStackTrace();
      } 
    }
    
    protected void consultarBase(String sql) throws Exception {
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
        } catch(Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        } 
    }
    
    
}
