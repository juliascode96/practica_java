package ej8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dos números");
        System.out.println("Esta es la sentencia 1");
        try {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println("Esta es la sentencia 2: Vamos  intentar dividir dos numeros");
            int div = num1 / num2;
            System.out.println("Esta es la sentencia 3");
            
        } 
        catch (ArithmeticException e) {
            System.out.println("No dividas por 0... Sentencia 4");
        }catch (InputMismatchException j) {
            System.out.println("Eso no es un número... Sentencia 5");
            throw (j);
        }  finally {
            System.out.println("Sentencia 6");
        }
        
        System.out.println("Sentencia 7");

    }
}
