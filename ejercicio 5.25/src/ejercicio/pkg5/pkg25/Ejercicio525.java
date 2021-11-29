
package ejercicio.pkg5.pkg25;


public class Ejercicio525 {

    
    public static void main(String[] args) {
       
        int[][] vector = new int[4][4];
        
        for (int i = 0; i < 4; i++) {
           for (int j = 0; j < 4; j++) {
               vector[i][j] = (int)(Math.random()*100);
           } 
        }
        
        for (int i = 0; i < 4; i++) {
           for (int j = 0; j < 4; j++) {
               System.out.print(vector[i][j] + " ");
           } 
            System.out.println("");
        }
    }
    
}
