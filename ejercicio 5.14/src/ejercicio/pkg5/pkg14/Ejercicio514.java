
package ejercicio.pkg5.pkg14;

import java.util.Scanner;

public class Ejercicio514 {

 
    public static void main(String[] args) {
        int aux;
        int num = 0;
        int limite;
        
        Scanner Sc = new Scanner(System.in);
        
        System.out.println("Ingrese un número límite");
            limite = Sc.nextInt();
        
        do {
            System.out.println("Ingrese un número");
            aux = Sc.nextInt();
            num = num + aux;
            System.out.println(num);
            
            
            
        } while (num < limite);
        
        
    }
    
}
