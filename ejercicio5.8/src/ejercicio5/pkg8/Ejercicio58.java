
package ejercicio5.pkg8;
import java.util.Scanner;

public class Ejercicio58 {

    
    public static void main(String[] args) {
        System.out.println("Ingrese un número");
        
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        
        if (num%2 == 0) {
            System.out.println("El número el par");
            
        } else {
            System.out.println("El número es impar");
        }
        
        
    }
    
}
