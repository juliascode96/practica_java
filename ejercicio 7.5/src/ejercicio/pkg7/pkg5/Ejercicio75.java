/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen
repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
guardará el país en el conjunto y después se le preguntará al usuario si quiere
guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
guardados en el conjunto.
Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
recordar como se ordena un conjunto.
Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un
Iterator, se buscará el país en el conjunto y si está en el conjunto se eliminará el
país que ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra
en el conjunto se le informará al usuario.
 */
package ejercicio.pkg7.pkg5;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio75 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        TreeSet<String> paises = new TreeSet();

        do {
            System.out.println("Ingrese un país");
            String pais = read.next();
            paises.add(pais);
            System.out.println("Desea agregar otro país? s/n");
        } while (read.next().equalsIgnoreCase("S"));

        for (String pais : paises) {
            System.out.println(pais);
        }
        System.out.println("Ingrese un país a eliminar");
        String eliminar = read.next();

//        if (paises.contains(eliminar)) {
//            paises.remove(eliminar);
//        } else {
//            System.out.println("No se encontró el país ingresado");
//        }

        Iterator it = paises.iterator();
        int cont = 0;

        while (it.hasNext()) {
            if (it.next().equals(eliminar)) {
                it.remove();
                cont++;
            }
        }

        if (cont == 0) {
            System.out.println("No se encontró el país ingresado");
        }

        System.out.println("---------");
        
        for (String pais : paises) {
            System.out.println(pais);
        }
        
    }
}
