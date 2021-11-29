
package ejercicio.pkg5.pkg27;
import java.util.Scanner;

public class Ejercicio527 {

  
    public static void main(String[] args) {
        System.out.println("Ingrese tamaño para la matriz");
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        
        int[][] matriz = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Ingrese un número");
                matriz[i][j] = Sc.nextInt();
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        
        int[] filas = new int[n];
        int[] columnas = new int[n];
        
        for (int i = 0; i < n; i++) {
           filas[i]=0;
        }
        
        for (int i = 0; i < n; i++) {
           columnas[i]=0;
        }
        
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                filas[i] = filas[i] + matriz[i][j];
            }
        }
        
        for (int j = 0; j < n; j++) {
                System.out.println("Suma de fila " + (j+1) + ": " + filas[j] + " ");
            }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                columnas[i] = columnas[i] + matriz[j][i];
            }
        }
        System.out.println("");
        
        for (int j = 0; j < n; j++) {
                System.out.println("Suma de columna " + (j+1) + ": " + columnas[j] + " ");
            }
        
        int diagonal = 0;
        int opuesta = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                   diagonal = diagonal + matriz[i][j]; 
                }
            }
        }
        
        System.out.println("");
        System.out.println("Suma de diagonal principal: " + diagonal);
        
          for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == n - (i+1)) {
                   opuesta = opuesta + matriz[i][j]; 
                }
            }
        }
          System.out.println("Suma de diagonal opuesta: " + opuesta);
          
          int contador = 0;
          for (int i = 0; i < n-1; i++) {
              if (filas[i] == filas[i+1]) {
                 contador++; 
              }
              
              if (columnas[i] == columnas[i+1]) {
                 contador++; 
              }
 
          }
          
          if (contador==(n*2)-2 && diagonal==opuesta && diagonal==columnas[0]) {
                  System.out.println("La matriz es mágica");
              } else{
                  System.out.println("La matriz no es mágica");
              } 
        
    }
    
}
