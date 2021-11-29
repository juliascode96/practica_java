/*
Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios
y muestre la suma de sus elementos.
 */
package extra.pkg5.pkg21;
import java.util.Random;
import java.util.Scanner;

public class Extra521 {


    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        
        
        System.out.println("Ingrese dimensiones para la matriz");
        int n = Sc.nextInt();
        int m = Sc.nextInt();
        int sumatoria = 0;
        
        Random r = new Random();
        
        int[][] matriz = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
               matriz[i][j] =  r.nextInt(10);
            }
            
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
               sumatoria = sumatoria + matriz[i][j];
            }
            
        }
        
        System.out.println("La suma de los elementos de la matriz es: "+sumatoria);
        
    }
    
}
