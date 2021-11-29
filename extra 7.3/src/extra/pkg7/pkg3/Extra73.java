/*
Implemente un programa para una Librería haciendo uso de un HashSet para evitar
datos repetidos. Para ello, se debe crear una clase llamada Libro que guarde la
información de cada uno de los libros de una Biblioteca. La clase Libro debe guardar
el título del libro, autor, número de ejemplares y número de ejemplares prestados.
También se creará en el main un HashSet de tipo Libro que guardará todos los libros
creados.
En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos
sus datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y
se le pregunta al usuario si quiere crear otro Libro o no.
• Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo
busca en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al
método. El método se incrementa de a uno, como un carrito de compras, el
atributo ejemplares prestados, del libro que ingresó el usuario. Esto sucederá
cada vez que se realice un préstamo del libro. No se podrán prestar libros de los
que no queden ejemplares disponibles para prestar. Devuelve true si se ha
podido realizar la operación y false en caso contrario.
• Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se
lo busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método.
El método decrementa de a uno, como un carrito de compras, el atributo
ejemplares prestados, del libro seleccionado por el usuario. Esto sucederá cada
vez que se produzca la devolución de un libro. No se podrán devolver libros
donde que no tengan ejemplares prestados. Devuelve true si se ha podido
realizar la operación y false en caso contrario.
• Método toString para mostrar los datos de los libros.
 */
package extra.pkg7.pkg3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Extra73 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        HashSet<Libro> libros = new HashSet();
        do {
            System.out.println("Ingrese título del libro");
            String titulo = read.next();
            System.out.println("Ingrese apellido del autor");
            String autor = read.next();
            System.out.println("Ingrese cantidad de ejemplares disponibles");
            int ejemplares = read.nextInt();
            System.out.println("Ingrese cuántos de esos ejemplares ya han sido prestados");
            int prestados = read.nextInt();
            Libro libro = new Libro(titulo, autor, ejemplares, prestados);
            libros.add(libro);
            System.out.println("Desea agregar otro libro? s/n");
        } while (read.next().equals("S"));

        System.out.println("Ahora mostramos la lista");
        libros.forEach((i) -> {
            System.out.println(i);
        });
        
        
        int selector = 0;
        while (selector < 3) {
            System.out.println("Para retirar un libro presione 1 // para devolver un libro presion 2 // Para salir presione 3");
            selector = read.nextInt();
            if (selector == 1) {
                System.out.println("¿Qué libro desea retirar?");
                String dev = read.next();
                Iterator<Libro> it = libros.iterator();
                while (it.hasNext()) {
                    Libro esteLibro = it.next();
                    if (dev.equalsIgnoreCase(esteLibro.getTitulo())) {
                        if (esteLibro.prestamo() == true) {
                            System.out.println("Libro prestado con éxito");
                            System.out.println("Quedan " + (esteLibro.getNumeroEjemplares() - esteLibro.getEjemplaresPrestados()) + " ejemplares");
                        } else {
                            System.out.println("No quedan ejemplares del libro ingresado");
                        }
                    }
                }

            } else if (selector == 2) {
                System.out.println("¿Qué libro desea devolver?");
                String dev = read.next();
                Iterator<Libro> it = libros.iterator();
                while (it.hasNext()) {
                    Libro esteLibro = it.next();
                    if (dev.equalsIgnoreCase(esteLibro.getTitulo())) {
                        if (esteLibro.devolucion() == true) {
                            System.out.println("Libro devuelto con éxito");
                            System.out.println("Quedan " + (esteLibro.getNumeroEjemplares() - esteLibro.getEjemplaresPrestados()) + " ejemplares");
                        } else {
                            System.out.println("Error, ningún ejemplar del libro seleccionado había sido prestado, dirijase a la biblioteca correcta :P");
                        }
                    }
                }

            }

        }
        System.out.println("Ahora mostramos la lista");
        libros.forEach((i) -> {
            System.out.println(i);
        });

    }
}
