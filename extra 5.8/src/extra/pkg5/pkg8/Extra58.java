/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco
debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de
números pares y la cantidad de números impares. Al igual que en el ejercicio
anterior los números negativos no deben sumarse. Nota: recordar el uso de la
sentencia break.
*/
package extra.pkg5.pkg8;
import java.util.Scanner;


public class Extra58 {

   
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n;
        int cant = 0;
        int pares = 0;
        int impares = 0;
        
        /*while (n % 5 != 0) {
            System.out.println("Ingrese un número");
            n = Sc.nextInt();
            
            if (n % 2 == 0) {
                pares++;
                
            } else {
                impares++;
            }
            
            cant++;
              
        }
        */
        
        while (2==2) {
            System.out.println("Ingrese un número");
            n = Sc.nextInt();
            
            if (n % 2 == 0) {
                pares++;
                
            } else {
                impares++;
            }
            
            cant++;
            
            if (n % 5 == 0) {
                break;
            }
              
        }
        
        System.out.println("Cantidad de números ingresados: "+cant);
        System.out.println("Cantidad de números pares ingresados: "+pares);
        System.out.println("Cantidad de números impares ingresados: "+impares);
        
        
    }
    
}
