
package ejercicio.pkg5.pkg7;
import java.lang.Math;
import java.util.Scanner;

public class Ejercicio57 {

   
    public static void main(String[] args) {
        
        System.out.println("Ingrese dos números");
        
        Scanner Sc = new Scanner(System.in);
        
        int num1 = Sc.nextInt();
        
        int num2 = Sc.nextInt();
        
        if (num1 != num2) {
            System.out.println("El número ingresado más grande es " + Math.max(num1, num2));
        
        if (Math.max(num1, num2) == num1) {
            System.out.println("Es decir, el número mayor es el primero ingresado");
            
        } else {
            System.out.println("Es decir, el número mayor es el segundo ingresado");
        }
            
        } else {
            System.out.println("Ambos números son iguales");
        }
        
        
       
    }
    
}
