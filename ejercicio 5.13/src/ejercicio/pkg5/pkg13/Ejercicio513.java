
package ejercicio.pkg5.pkg13;

import java.util.Scanner;

public class Ejercicio513 {

  
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int nota ;
        
         do {
             
              System.out.println("Ingrese una nota entre el 0 y el 10");
              nota = Sc.nextInt();
             
         } while (nota < 0 || nota > 10);
        
        
        
         System.out.println("La nota es " + nota);
        
    }
    
}
