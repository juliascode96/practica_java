
package ejercicio.pkg5.pkg3;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio53 {

    public static void main(String[] args) {
       
        System.out.println("Ingrese una frase");
        
        Scanner Sc = new Scanner(System.in);
        
        String frase = Sc.nextLine();
        
        System.out.println(frase.toUpperCase());
         System.out.println(frase.toLowerCase());
    }
    
}
