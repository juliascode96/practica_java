
package ejercicio.pkg5.pkg26;
import java.util.Scanner;

public class Ejercicio526 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int[][] matriz = new int[3][3];
        int cont = 0;
        
        
        System.out.println("Llene su matriz 3x3, y su traspuesta");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               
                matriz[i][j]= leer.nextInt();  
            } 
        }
        
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                if (matriz[i][j]==(matriz[j][i])*-1) {
                cont++;     
                }   
            } 
        }
        
        if (cont==9) {
           System.out.println("La matriz es anti-simetrica"); 
        }else {
            System.out.println("Le pifiaste");
        }

    }

       
    }
    

