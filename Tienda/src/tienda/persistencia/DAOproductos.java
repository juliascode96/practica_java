package tienda.persistencia;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Producto;

public class DAOproductos extends DAO {

    public DAOproductos() {
    }

    public void guardarProducto(Producto p) throws Exception {
        try {
            String sql = "INSERT INTO producto (nombre, precio, codigo_fabricante)"
                    + "VALUES ('" + p.getNombre()
                    + "','" + p.getPrecio() + "','" + p.getCodigoFabricante() + "');";
            insertarModificarEliminar(sql);
        } catch (SQLException e) {
            System.out.println("Ocurrió un error");
            desconectarBase();
        }
    }
    
    public void modificarProducto(Producto p, int buscar) throws Exception {
        try {
            String sql = "UPDATE producto SET precio=" 
                        +p.getPrecio()+ ",nombre = '" +p.getNombre()+ "' WHERE codigo = '"+ buscar +"';";            
            insertarModificarEliminar(sql);
        } catch(SQLException e) {
            System.out.println("Ocurrió un error en la actualización");
            desconectarBase();           
        } 
    }
    
    public ArrayList<Producto> buscarProducto(String nombre) throws Exception {
        try {
            conectarBase();
            String sql = "SELECT * FROM Productos WHERE nombre = " + nombre + "";
            consultarBase(sql);
            Producto p = null;
            ArrayList <Producto> productos = new ArrayList();
            while (resultado.next()) {
                p = new Producto();
                p.setCodigo(resultado.getInt(1));
                p.setNombre(resultado.getString(2));
                p.setPrecio(resultado.getInt(3));
                p.setCodigoFabricante(resultado.getInt(4));
                productos.add(p);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
    
    public Collection<String> mostrarNombres() throws Exception {
        try {
            
            String sql = "SELECT nombre from Producto";
            consultarBase(sql);
            Producto prod = null;
            Collection<String> nombres = new ArrayList();
            while (resultado.next()) {
                prod = new Producto();
                nombres.add(resultado.getString("nombre"));
            }
            return nombres;
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }

    }
    
    public Collection<Producto> mostrarNombresPrecios() throws Exception{
        try {
           conectarBase();
           consultarBase("SElECT nombre, precio from producto");
           Producto p = null;
           Collection<Producto> productos = new ArrayList();
           while (resultado.next()) {
               p = new Producto();
               p.setNombre(resultado.getString(1));
               p.setPrecio(resultado.getDouble(2));
               productos.add(p);
           }
           return productos;
           
        } catch(Exception e) {
            System.out.println("Error de búsqueda"); 
            e.printStackTrace();
            throw e;
        } finally {
            desconectarBase();
        }
        
    }
    
    public Collection<Producto> buscarPorPrecio(int p1, int p2) throws Exception {
        try {
            conectarBase();
           consultarBase("SElECT * from producto WHERE precio BETWEEN '" + p1 + "' AND '" + p2 + "';");
           Producto p = null;
           Collection<Producto> productos = new ArrayList();
           while (resultado.next()) {
                p = new Producto();
                p.setCodigo(resultado.getInt(1));
                p.setNombre(resultado.getString(2));
                p.setPrecio(resultado.getDouble(3));
                p.setCodigoFabricante(resultado.getInt(4));
                productos.add(p);
           }
           return productos;
           
        } catch(Exception e) {
            System.out.println("Error de búsqueda"); 
            throw e;
        } finally {
            desconectarBase();
        } 
    }
    
    public ArrayList<Producto> buscarProductos(String sql) throws Exception {
        try {
            conectarBase();
           consultarBase(sql);
           Producto p = null;
           ArrayList<Producto> productos = new ArrayList();
           while(resultado.next()) {
               p = new Producto();
               p.setCodigo(resultado.getInt(1));
               p.setNombre(resultado.getString(2));
               p.setPrecio(resultado.getDouble(3));
               p.setCodigoFabricante(resultado.getInt(4));
               productos.add(p);
           }
           return productos;
        
        } catch(Exception e) {
          throw e;  
        } finally {
            desconectarBase();
        }
    }

}
