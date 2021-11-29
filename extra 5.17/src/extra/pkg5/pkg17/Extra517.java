/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de
tamaño N, con los valores ingresados por el usuario.
*/
package extra.pkg5.pkg17;
import java.util.Scanner;

public class Extra517 {

 
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        
        System.out.println("Ingrese tamaño del vector");
        int n = Sc.nextInt();
        
        int[] vector = new int[n];
        int sumatoria = 0;
        
        for (int i = 0; i < n; i++) {
            vector[i] = Sc.nextInt();
            
            
        }
        
        for (int i = 0; i < n; i++) {
           sumatoria = sumatoria + vector[i]; 
           System.out.print(vector[i] + " ");
            
        }
        System.out.println("");
        
        System.out.println(sumatoria);
       
    }
    
}
