
package ejercicio.pkg7.pkg1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Ejercicio71 {


    public static void main(String[] args) {
        
        ArrayList <String> raza = new ArrayList();
        Scanner read= new Scanner(System.in);
        do {
            System.out.println("Ingrese una raza de perro");
            raza.add(read.nextLine());
            System.out.println("Desea agregar otra raza? s/n");
        } while (read.nextLine().equalsIgnoreCase("S"));
        
        // Mostramos la lista
        System.out.println("Ahora mostramos la lista");
        raza.forEach((i) -> { //funcion flecha
            System.out.println(i);
        });
    
    Iterator <String> it = raza.iterator(); //Nuevo iterator para el arrayList "raza"
        Mostrar(raza);
        System.out.println("Ingrese una raza para eliminar");
        String eliminado = read.next();
        eliminar(raza,it,eliminado);
        Mostrar(raza);
    }
    
    public static void Mostrar(ArrayList <String> raza){
        // Mostramos la lista
        System.out.println("Ahora mostramos la lista");
        raza.forEach((i) -> { //funcion flecha
            System.out.println(i);
        });
    }
    public static void eliminar(ArrayList <String> raza, Iterator it ,String eliminado){
        // Eliminamos raza 
        while (it.hasNext()) {
            if (it.next().equals(eliminado)) {
                it.remove();
            }
        }
    }
    
 }