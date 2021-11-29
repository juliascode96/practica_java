/*
Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).
 */
package extra.pkg7.pkg1;

import java.util.ArrayList;
import java.util.Scanner;


public class Extra71 {

    public static void main(String[] args) {
        ArrayList <Integer> numeros = new ArrayList();
        Scanner read = new Scanner(System.in);
        int num;
        
        do {
            System.out.println("Ingrese un número para agregar a la lista / Ingrese -99 para salir");
            num = read.nextInt();
            if (num != -99) {
                numeros.add(num); 
            }
        } while(num!=-99);
        
        Integer suma = 0;
        
        for (int i = 0; i < numeros.size(); i++) {
            suma = suma + numeros.get(i);
        }
        
        System.out.println("La suma de todos los números introducidos es: " + suma);
        System.out.println("El promedio de todos los números introducidos es: " + suma/numeros.size());
    }
    
}
