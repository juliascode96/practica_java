/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre
sumar, restar, multiplicar y dividir. La aplicación debe tener una función para cada
operación matemática y deben devolver sus resultados para imprimirlos en el main.
 */
package extra.pkg5.pkg14;
import java.util.Scanner;

public class Extra514 {


    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        
        System.out.println("Ingrese dos números");
        int num1 = Sc.nextInt();
        int num2 = Sc.nextInt();
        
        System.out.println("Presione: \n 1. Sumar \n 2. Restar \n 3. Multiplicar \n 4. Dividir");
        int selector = Sc.nextInt();
        
        switch (selector) {
            case 1:
                System.out.println(sumarNumeros(num1,num2));
                break;
            case 2:
                 System.out.println(restarNumeros(num1,num2));
                break;
            case 3:
                 System.out.println(multNumeros(num1,num2));
                break;
            case 4:
                 System.out.println(dividirNumeros(num1,num2));
                break;
            default:
                System.out.println("Opción no válida");
        }
        
        
    }
    
    public static int sumarNumeros(int num1, int num2) {
        int resultado = num1 + num2;
        
        return resultado;
        
    }
    
     public static int restarNumeros(int num1, int num2) {
        int resultado = num1 - num2;
        
        return resultado;
        
    }
     
      public static int multNumeros(int num1, int num2) {
        int resultado = num1 * num2;
        
        return resultado;
        
    }
      
       public static double dividirNumeros(int num1, int num2) {
        double resultado = num1 / num2;
        
        return resultado;
        
    }
    
}
