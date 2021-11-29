
package ejercicio.pkg5.pkg1;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio51 {
    
  
    public static void main(String[] args) {
        
        System.out.println("Ingrese un número");
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        
        System.out.println("Ingrese otro número");
        Scanner Sc1 = new Scanner(System.in);
        int num2 = Sc1.nextInt();
        
        int num3 = num + num2;
        
        System.out.println("El resultado de la suma de los números ingresados es " + num3);
    }
    
}
