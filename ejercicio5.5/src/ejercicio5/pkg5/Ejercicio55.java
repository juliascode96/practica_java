
package ejercicio5.pkg5;

import java.util.Scanner;

public class Ejercicio55 {

 
    public static void main(String[] args) {
        System.out.println("Ingrese la temperatura en grados centígrados");
        
        Scanner Sc = new Scanner(System.in);
        int temp = Sc.nextInt();
        
        double far = (temp * 1.8) + 32;
        
        System.out.println("La temperatura en grados F es " + far);
    }
    
}
