
package ejercicio.pkg5.pkg18.alt;


public class Ejercicio518Alt {

  
    public static void main(String[] args) {
        for (int i = 0; i < 10; ++i) {
            for (int j = 0; j < 10; ++j) {
                for (int k = 0; k < 10; ++k) {
                    
                    if (i == 3) {
                       System.out.println("E" + " - " + j + " - " + k); 
                        
                    } else if (j == 3){
                         System.out.println(i + " - " + "E" + " - " + k);
                    
                    } else if (k == 3) {
                        System.out.println(i + " - " + j + " - " + "E");
                        
                    } else {
                       System.out.println(i + " - " + j + " - " + k); 
                    }
                    }
                 }
        }
    }
    
}
