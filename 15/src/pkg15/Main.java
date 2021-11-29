
package pkg15;
import java.util.Scanner;

public class Main {

 
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        Scanner Sc1 = new Scanner(System.in);
        
        System.out.println("Ingrese dos números");
        int num1 = Sc1.nextInt();
        int num2 = Sc1.nextInt();
        
        String selector2 = " ";
        int selector1;
        
        while (!selector2.equals("S")) {
            System.out.println("Menu:\n 1. Sumar\n 2. Restar\n 3. Multiplicar\n 4. Dividir\n 5. ¿Salir? (S/N)\n Elija opción:");
            
            selector1 = Sc.nextInt();
            
            switch (selector1) {
                case 1:
                    System.out.println("La suma de los números ingresados es " + (num1+num2));
                    break;
                case 2:
                    System.out.println("La resta de los números ingresados es " + (num1-num2));
                    break;
                case 3: 
                    System.out.println("La multiplicación de los números ingresados es " + (num1*num2));
                    break;
                case 4:
                    double resultado = num1 / num2;
                    System.out.println("La división de los números ingresados es " + resultado);
                    break;
                case 5:
                    System.out.println("¿Desea salir del programa? (S/N)");
                    selector2 = Sc1.next();
            }
            
        }
        
    }
    
}
