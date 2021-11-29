/*
Realice un programa para que el usuario adivine el resultado de una multiplicación
entre dos números generados aleatoriamente entre 0 y 10. El programa debe
indicar al usuario si su respuesta es o no correcta. En caso que la respuesta sea
incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. Para
realizar este ejercicio investigue como utilizar la función Math.random() de Java.
 */
package extra.pkg5.pkg10;
import java.util.Scanner;
import java.util.Random;

public class Extra510 {

  
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        Random r = new Random();
        
        int num1 = r.nextInt(10);
        int num2 = r.nextInt(10);
        
        System.out.println(num1+" "+num2);
        
        int adivinar = num1*num2;
        int intento;
        
        while (0==0) {
            System.out.println("Adivine el resultado de la multiplicación de los números ingresados");
            intento = Sc.nextInt();
            
            if (intento==adivinar) {
                System.out.println("Correcto");
                break;
            }
            
            System.out.println("Intentelo de nuevo...");
        }
        
        
        
    }
    
}
