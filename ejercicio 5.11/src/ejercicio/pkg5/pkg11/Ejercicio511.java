
package ejercicio.pkg5.pkg11;
import java.util.Scanner;

public class Ejercicio511 {

    public static void main(String[] args) {
        System.out.println("ingrese una palabra que comience con A");
        
        Scanner Sc = new Scanner(System.in);
        String palabra = Sc.nextLine();
        
        System.out.println(palabra.substring(0,1));
        
        if (palabra.substring(0,1).equals("A")) {
            System.out.println("Correcto");
            
        } else {
            System.out.println("Incorrecto");
        }
        
    }
    
}
