/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a
cada una. A continuación, realizar las instrucciones necesarias para que: B tome el
valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B.
Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una
variable auxiliar.
 */
package extra.pkg5.pkg2;

import java.util.Random;

public class Extra52 {

    public static void main(String[] args) {

        Random r = new Random();

        int aux;
        int A = r.nextInt(10 - 1);
        int B = r.nextInt(10 - 1);
        int C = r.nextInt(10 - 1);
        int D = r.nextInt(10 - 1);

        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);

        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
       

        System.out.println("CAMBIO");
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);

    }

}
