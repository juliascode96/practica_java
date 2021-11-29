
package ejercicio.pkg5.pkg21;
import java.util.Scanner;

public class Ejercicio521 {
   
    public static void main(String[] args) {
        
        Scanner Sc = new Scanner(System.in);
        int num;
        
        for (int i = 0; i < 4 ; i++) {
            System.out.println("Ingrese un número");
            num = Sc.nextInt();
            System.out.print(num + " ");
            
            for (int j = 0; j < num ; j++) {
             System.out.print("*");   
            }
            System.out.println("");
        }
        
    }
    
}
