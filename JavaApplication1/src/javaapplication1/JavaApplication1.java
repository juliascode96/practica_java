
package javaapplication1;

import java.util.Scanner;


public class JavaApplication1 {

   
    public static void main(String[] args) {
        
        
        System.out.println("¿Cuál es su nombre?");
        
        Scanner Sc = new Scanner(System.in);
        
        String nombre = Sc.nextLine();
        
        System.out.println("¿Es su nombre " + nombre + "?");
        
        Scanner Sc2 = new Scanner(System.in);
        
        String res = Sc2.nextLine();
        
        if (res.equals("Si")) {
            System.out.println("Hola " + nombre);
        } else {
            System.out.println("Adios no-" + nombre);
        }
        
        int[] arreglo = new int[5];
        arreglo[0] = 1 ;
        
        System.out.println(arreglo[0]);
        
    }}
