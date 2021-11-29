
package tienda.service;

import java.util.Scanner;
import tienda.entidades.Fabricante;
import tienda.persistencia.DAOfabricantes;


public class FabricanteSV extends DAOfabricantes{
    Scanner sc = new Scanner(System.in);
    
    public void crearFabricante(){
        System.out.println("Ingrese nombre del fabricante");
        String nombre = sc.next();
        Fabricante f = new Fabricante(nombre);
        try {
         guardarFabricante(f);   
        } catch(Exception e) {
            
        }
        
    }
    
}
