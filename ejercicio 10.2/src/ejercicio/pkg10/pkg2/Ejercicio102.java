
package ejercicio.pkg10.pkg2;

import java.util.Scanner;

public class Ejercicio102 {


    public static void main(String[] args) {
        int[] vector = new int[5];
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("El array es de 5 elementos");
        int cont = 0;
        do {
            System.out.println("Agrege un numero al vector");
            try {
                vector[cont] = read.nextInt();
            } catch (ArrayIndexOutOfBoundsException ar) {
                System.out.println("Te fuiste de indice, no podes agregar mas elementos");
                break;
            }
            System.out.println("Ya se agregaron " + (cont+1) + " elementos");
            System.out.println("Desea agregar un elemento mas al array? s/n");
            cont++;
        } while (read.next().equalsIgnoreCase("s"));
    }
    
}
