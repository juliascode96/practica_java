/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a
medida que el usuario las va ingresando, construya una “sopa de letras para niños”
de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden
horizontal en una fila que será seleccionada de manera aleatoria. Una vez
concluida la ubicación de las palabras, rellene los espacios no utilizados con un
número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras
creada.
 */
package extra.pkg5.pkg22;

import java.util.Scanner;
import java.util.Random;

public class Extra522 {

    public static void main(String[] args) {
        String[][] sopa = new String[20][20];
        int n;
        int m;
        String palabra = "";
        String letra;

        Scanner Sc = new Scanner(System.in);
        Random r = new Random();

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                sopa[i][j] = " ";
            }
        }

        for (int i = 0; i < 5; i++) {
            do {
                System.out.println("Ingrese una palabra que tenga entre 3 y 5 caractéres");
                palabra = Sc.next();
            } while (palabra.length() < 3 || palabra.length() > 5);
            System.out.println("Su palabra: " + palabra);
            do {
                n = r.nextInt(20);
            } while (!sopa[n][0].equals(" "));
            m = r.nextInt(15);

            for (int j = 0; j < palabra.length(); j++) {
                sopa[n][m+j] = palabra.substring(j,(j+1));

            }

        }

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (sopa[i][j].equals(" ")) {
                    letra = Integer.toString(r.nextInt(9));
                    sopa[i][j] = letra;

                }

            }

        }

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopa[i][j] + " ");

            }
            System.out.println("");

        }
    }
}
