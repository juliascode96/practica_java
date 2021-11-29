
package tienda.persistencia;

import java.sql.SQLException;
import tienda.entidades.Fabricante;


public class DAOfabricantes extends DAO{
    
    public void guardarFabricante(Fabricante f) throws Exception {
        try {
            String sql = "INSERT INTO fabricante (nombre)"
                    + "VALUES ('" + f.getNombre()
                    + "');";
            insertarModificarEliminar(sql);
        } catch (SQLException e) {
            System.out.println("Ocurrió un error");
            desconectarBase();
        }
    }
    
}
