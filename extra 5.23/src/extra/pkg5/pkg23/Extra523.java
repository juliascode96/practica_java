
package extra.pkg5.pkg23;

import java.util.Scanner;

public class Extra523 {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Hasta que número desea ver la sucesión de Fibonacci?");
        int n = Sc.nextInt();
        int cont = 1;
        int fibonacci = 0;

        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            vector[i] = fibonacci + cont;
            cont = fibonacci;
            fibonacci = vector[i];

            System.out.print(vector[i] + " ");
        }

    }

}
