
package ejercicio5.pkg6;
import java.lang.Math;
import java.util.Scanner;

public class Ejercicio56 {

  
    public static void main(String[] args) {
        
        System.out.println("Ingrese un número");
        
        Scanner Sc = new Scanner(System.in);
        
        double num = Sc.nextInt();
        
        System.out.println("El doble del número ingresado es " + num *  2);
        System.out.println("El triple del número ingresado es " + num *  3);
        System.out.println("La raís cuadrada del número ingresado es " + Math.sqrt(num));
        
    }
    
}
