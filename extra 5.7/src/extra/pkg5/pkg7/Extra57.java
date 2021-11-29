/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
promedio de n números (n>0). El valor de n se solicitará al principio del programa y
los números serán introducidos por el usuario. Realice dos versiones del programa,
una usando el bucle “while” y otra con el bucle “do - while”.
*/
package extra.pkg5.pkg7;
import java.util.Scanner;

public class Extra57 {

   
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = 1;
        int menor = 0;
        int mayor = 0;
        double prom = -1;
        int suma = 0;
        
        /* do {
            System.out.println("Ingrese un número. Ingrese 0 para salir.");
            n = Sc.nextInt();
            
            if (n<menor && n!=0 || menor == 0) {
                menor = n;
                
            }
            
            if (n>mayor) {
                mayor = n;
                
            }
            
            suma = suma+n;
            prom++;
            
            
        } while (n!=0); */
        
        
        
        
        
        while (n!=0) {
            
            System.out.println("Ingrese un número. Ingrese 0 para salir.");
            n = Sc.nextInt();
            
            if (n<menor && n!=0 || menor == 0) {
                menor = n;
                
            }
            
            if (n>mayor) {
                mayor = n;
                
            }
            
            suma = suma+n;
            prom++;
            
        }
        prom = suma/(prom);
        
        System.out.println("El menor número ingresado es: "+menor);
        System.out.println("El mayor número ingresado es: "+mayor);
        System.out.println("El promedio de los números ingresados es: "+prom);
        
       
    }
    
}
