package tienda;

import tienda.entidades.Producto;
import tienda.persistencia.DAOproductos;
import tienda.service.FabricanteSV;
import tienda.service.ProductoSV;

public class Tienda {

    public static void main(String[] args) {
     ProductoSV sv = new ProductoSV();
     DAOproductos Dsv = new DAOproductos();
     FabricanteSV f = new FabricanteSV();
     
     
     
     try {
         System.out.println(sv.buscar());
         System.out.println("");
         System.out.println("--------------");
         System.out.println("");
         for (String producto : Dsv.mostrarNombres()) {
            System.out.println(producto);
            
        } 
          System.out.println("");
         System.out.println("--------------");
         System.out.println("");
         for (Producto producto : Dsv.mostrarNombresPrecios()) {
            System.out.println(producto.getNombre());
            System.out.println(producto.getPrecio());
        }  
          System.out.println("");
         System.out.println("--------------");
         System.out.println("");
         for (Producto producto : Dsv.buscarPorPrecio(120, 202)) {
            System.out.println(producto.getNombre());
            System.out.println(producto.getPrecio());
        } 
         //f.crearFabricante();
         //sv.agregarProducto();
         //sv.modificar();
         
     } catch(Exception e) {
         System.out.println("Error");
         e.printStackTrace();
     } 
       

    }
}
