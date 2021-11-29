/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
elementos y el combinado de 20.
 */
package ejercicio.pkg6.pkg10;

import java.util.Arrays;

public class Ejercicio610 {

    public static void main(String[] args) {
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
        
        arregloA = llenarArreglo(arregloA);
        escribirArreglo(arregloA, 50);
        Arrays.sort(arregloA);
        System.out.println("");
        escribirArreglo(arregloA, 50);
        arregloB = Arrays.copyOf(arregloA, 20);
        Arrays.fill(arregloB, 10, 20, 0.5);
        System.out.println("");
        escribirArreglo(arregloB, 20);
        
    }
    
    public static double[] llenarArreglo(double[] arregloA) {
        for (int i = 0; i < 50; i++) {
           arregloA[i] = (int) (Math.random()*100) ;
        }
        
        return arregloA;
    }
    
    public static void escribirArreglo(double[] arreglo, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo[i] + " "); 
        }
    }
    
}
