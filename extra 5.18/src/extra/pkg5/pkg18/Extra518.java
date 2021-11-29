/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
 */
package extra.pkg5.pkg18;
import java.util.Scanner;


public class Extra518 {


    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        
        System.out.println("Ingrese tamaño para los vectores");
        int n = Sc.nextInt();
        
        int[] vector1 = new int[n];
        int[] vector2 = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese número para vector 1");
            vector1[i] = Sc.nextInt();
            System.out.println("Ingrese número para vector 2");
            vector2[i] = Sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            if (vector1[i]!=vector2[i]) {
                System.out.println("Los vectores no son iguales");
                break;
                
            }
        }
        
    }
    
}
