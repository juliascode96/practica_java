//Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
//cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
package ejercicio.pkg5.pkg24;

import java.util.Scanner;

public class Ejercicio524 {

  
    public static void main(String[] args) {
    
        System.out.println("Ingrese tamaño del vector");
        Scanner Sc = new Scanner(System.in);
        Scanner Sc1 = new Scanner(System.in);
        int n = Sc.nextInt();
        
        int[] vector = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese un número entre el 1 y el 99999");
            vector[i] = Sc1.nextInt(); 
        }
            
        int dig1 = 0;
        int dig2 = 0;
        int dig3 = 0;
        int dig4 = 0;
        int dig5 = 0;
        
         for (int i = 0; i < n; i++) {
             if (vector[i]<10) {
              dig1++;   
             } else if (vector[i]>9 && vector[i]<100){
                 dig2++;
             }
             else if (vector[i]>99 && vector[i]<1000){
                 dig3++;
             }
             else if (vector[i]>999 && vector[i]<10000){
                 dig4++;
             }
             else if (vector[i]>9999){
                 dig5++;
             }
         }
         System.out.println("Números de una cifra: " + dig1);
         System.out.println("Números de dos cifras: " + dig2);
         System.out.println("Números de tres cifras: " + dig3);
         System.out.println("Números de cuatro cifras: " + dig4);
         System.out.println("Números de cinco cifras: " + dig5);
         
    
  }
    
}
