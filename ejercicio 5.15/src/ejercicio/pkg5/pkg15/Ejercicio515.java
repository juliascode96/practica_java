package ejercicio.pkg5.pkg15;

import java.util.Scanner;

public class Ejercicio515 {

   
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Ingrese dos números");
        double num1 = Sc.nextInt();
        double num2 = Sc.nextInt();
        
        char selector1 =' ';
        
        do {
            System.out.print("Menu \n1. Sumar \n2. Restar \n3. Multiplicar \n4. Dividir \n5. Salir \nElija opción:");
            int selector2 = Sc.nextInt();
            switch (selector2) {
                case 1:
                    double resultado = num1 + num2 ;
                    System.out.println(resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println(resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println(resultado);
                    break;
                case 4: 
                    resultado = num1 / num2;
                    System.out.println(resultado);
                    break;
                case 5:
                    System.out.println("¿Esta seguro de que desea salir del programa (S/N)?");
                    selector1 = Sc.next().charAt(0);
            }
            
            
        } while (selector1 != 'S');
        
        
    }
    
}
