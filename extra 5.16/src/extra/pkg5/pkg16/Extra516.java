/*
Crea una aplicación que nos pida un número por teclado y con una función se lo
pasamos por parámetro para que nos indique si es o no un número primo, debe
devolver true si es primo, sino false.
Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25
no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
 */
package extra.pkg5.pkg16;

import java.util.Scanner;

public class Extra516 {

    public static void main(String[] args) {
        System.out.println("Ingrese un número");
        Scanner Sc = new Scanner(System.in);

        int num = Sc.nextInt();
        int primo = 0;

        for (int i = 1; i < num + 1; i++) {
            if (num % i == 0) {
                primo++;

            }

        }
        if (primo > 2) {
            System.out.println("El número ingresado no es primo");

        } else {
            System.out.println("El número ingresado es primo");
        }

    }

}
