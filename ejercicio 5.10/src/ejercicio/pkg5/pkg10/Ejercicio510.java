
package ejercicio.pkg5.pkg10;
import java.util.Scanner;

public class Ejercicio510 {

   
    public static void main(String[] args) {
        System.out.println("Ingrese una palabra de ocho letras");
        
        Scanner Sc = new Scanner(System.in);
        String palabra = Sc.nextLine();
        
        if (palabra.length() == 8) {
            System.out.println("Correcto");
            
        } else {
            System.out.println("Incorrecto");
        }
       
    }
    
}
