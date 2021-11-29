/*
Crear una función que rellene un vector con números aleatorios, pasándole un arreglo
por parámetro. Después haremos otra función o procedimiento que imprima el
vector.
 */
package extra.pkg5.pkg19;
import java.util.Random;

public class Extra519 {

   
    public static void main(String[] args) {
        int n = 5;
        int[] vector = new int[n];
        llenarVector(vector,n);
        leerVector(vector,n);
        
        
        
    }
    
    public static int[] llenarVector(int[] vector, int n) {
       Random r = new Random();
       
        for (int i = 0; i < n; i++) {
           vector[i] = r.nextInt(100);
        }
        
        
        return vector;
    }
    
    public static void leerVector(int[] vector, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("[ "+vector[i]+" ]");
        }
    }
    
}
