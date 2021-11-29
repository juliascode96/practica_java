/*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una
vocal. Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la
clase String.
 */
package extra.pkg5.pkg3;

import java.util.Scanner;

public class Extra53 {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String letra = "";

        while (!letra.equalsIgnoreCase("A") && !letra.equalsIgnoreCase("E") && !letra.equalsIgnoreCase("I") && !letra.equalsIgnoreCase("O") && !letra.equalsIgnoreCase("U")) {

            System.out.println("Ingrese una vocal");
            letra = Sc.next();

        }
        System.out.println("La letra ingresada es una vocal");

    }
}
