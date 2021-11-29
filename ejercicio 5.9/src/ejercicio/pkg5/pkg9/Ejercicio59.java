
package ejercicio.pkg5.pkg9;

import java.util.Scanner;


public class Ejercicio59 {

    
    public static void main(String[] args) {
       System.out.println("Escriba eureka");
        
        Scanner Sc = new Scanner(System.in);
        
        String palabra = Sc.nextLine();
        
        if (palabra.equals("eureka")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
    
}
