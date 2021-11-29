
package ejercicio.pkg5.pkg20;

import java.util.Scanner;
public class Ejercicio520 {

    
    public static void main(String[] args) {
        System.out.println("Ingrese un número");
        Scanner Sc = new Scanner(System.in);
        
        int n = Sc.nextInt();
        
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n ; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                    
                } else {
                    System.out.print(" ");
                }
                   
            }
            System.out.println("");
            
        }
    }
    
}
