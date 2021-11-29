/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora debe generar un número aleatorio entre 1 y 500, y el usuario
tiene que intentar adivinarlo. Para ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el número que tiene que 
adivinar es mayor o menor que el que ha introducido el usuario. Cuando consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que 
el usuario ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe controlar esa excepción e indicarlo por pantalla. En 
este último caso también se debe contar el carácter fallido como un intento.
 */
package ejercicio.pkg10.pkg4;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio104 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero = (int) Math.floor(Math.random()*(500-1+1)+1);
        System.out.println(numero);
        int a = 0;
        int intentos = 0;
        do {
            System.out.println("Adivine el número");
            try {
            a = sc.nextInt();
            intentos++;
                if (a < numero){
                System.out.println("Intente con un número más grande");
                
            } else if (a > numero){
                System.out.println("Intente con un número más bajo");
            } else {
                System.out.println("Correcto");
            } 
            
            } catch (InputMismatchException e) {
                System.out.println("Por favor ingrese un número y no cualquier cosa");
                a = 0;
                intentos++;
                sc.next();
            }
            
          
            System.out.println("Usted ha intentado adivinar " + intentos + " veces");
        } while (a != numero);
       
    }
    
}
