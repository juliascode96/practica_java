
package tienda.service;

import java.util.ArrayList;
import java.util.Scanner;
import tienda.entidades.Producto;
import tienda.persistencia.DAOproductos;

public class ProductoSV extends DAOproductos{
     Scanner sc= new Scanner(System.in);
     
    public ArrayList<Producto> buscar() throws Exception{
       
        System.out.println("Ingrese búsqueda");
        String sql1 = sc.nextLine();
        String sql = "SELECT nombre, precio FROM producto where precio = (SELECT MIN(precio) FROM producto)";
        try {
           return buscarProductos(sql1);
        } catch(Exception e){
           throw e; 
        }  
        
    }
    
    public void agregarProducto(){
        System.out.println("Ingrese nombre");
        String nombre = sc.nextLine();
        System.out.println("Ingrese precio");
        double precio = sc.nextDouble();
        System.out.println("Ingrese código de fabricante");
        int CF = sc.nextInt();
        
        Producto p = new Producto(nombre, precio, CF);
        try {
           guardarProducto(p);  
        } catch(Exception e) {
            
        } 
       
}
    
    public void modificar(){
        System.out.println("Qué producto desea modificar?");
        int buscar = sc.nextInt();
        System.out.println("Ingrese datos correctos de " + buscar);
        System.out.println("Ingrese nombre");
        String nombre = sc.next();
        System.out.println("Ingrese precio");
        double precio = sc.nextDouble();
        System.out.println("Ingrese código de fabricante");
        int CF = sc.nextInt();
        
        Producto p = new Producto(nombre, precio, CF);
        try {
           modificarProducto(p, buscar);  
        } catch(Exception e) {
            
        }
    }

}


