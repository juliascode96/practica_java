//Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
//pida al usuario un numero a buscar en el vector. El programa mostrará donde se
//encuentra el numero y si se encuentra repetido
package ejercicio.pkg5.pkg23;

import java.util.Scanner;
import java.lang.Math;

public class Ejercicio523 {

    public static void main(String[] args) {
        System.out.println("Ingrese tamaño del vector");
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();

        int[] vector = new int[n];

        for (int i = 0; i < n - 1; i++) {
            vector[i] = (int) (Math.random() * 10);
        }

        for (int i = 0; i < n - 1; i++) {
            System.out.print(vector[i] + " ");
        }

        System.out.println("Ingrese el número que desea buscar en el vector");
        int num = Sc.nextInt();
        int cantidad = 0;

        for (int i = 0; i < n - 1; i++) {
            if (vector[i] == num) {
                System.out.println("se encontró el número " + num + " en la posición " + (i + 1));
                cantidad++;

            }

        }
        System.out.println("El número " + num + " se encontró " + cantidad + " veces");

    }

}
