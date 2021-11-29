package ejercicio.pkg5.pkg28;

import java.util.Scanner;

public class Ejercicio528 {

    public static void main(String[] args) {

        int[][] matrizM = new int[10][10];
        int[][] matrizP = new int[3][3];

        Scanner Sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizM[i][j] = (int) Math.floor(Math.random() * (100 - 1 + 1) + 1);
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matrizM[i][j] + " ");
            }
            System.out.println("");
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese un número");
                matrizP[i][j] = Sc.nextInt();
            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                for (int k = 0; k < 1; k++) {
                    for (int l = 0; l < 1; l++) {
                        if (matrizM[i][j] == matrizP[k][l]
                                && matrizM[i][j + 1] == matrizP[k][l + 1]
                                && matrizM[i][j + 2] == matrizP[k][l + 2]
                                && matrizM[i + 1][j] == matrizP[k + 1][l]
                                && matrizM[i + 1][j + 1] == matrizP[k + 1][l + 1]
                                && matrizM[i + 1][j + 2] == matrizP[k + 1][l + 2]
                                && matrizM[i + 2][j] == matrizP[k + 2][l]
                                && matrizM[i + 2][j + 1] == matrizP[k + 2][l + 1]
                                && matrizM[i + 2][j + 2] == matrizP[k + 2][l + 2]) {
                            System.out.println("Se encontró la matriz P entre las posiciones " + (i + 1) + "," + (j + 1) + " y " + (i + 3) + "," + (j + 3));
                        }
                    }
                }
            }

        }

    }
}
