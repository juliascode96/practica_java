/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas.
Para esto, tendremos una clase Pelicula con el titulo, director y duración de la
película (en horas). Implemente las clases y métodos necesarios para esta
situación, teniendo en cuenta lo que se pide a continuación:
En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
usuario todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario
si quiere crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
en pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
en pantalla.
• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package ejercicio.pkg7.pkg4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio74 {

    public static void main(String[] args) {
        ArrayList<Pelicula> peliculas = new ArrayList();
        Scanner read = new Scanner(System.in);
        do {
            System.out.println("Ingrese titulo de la película");
            String titulo = read.next();
            System.out.println("Ingrese apellido del director");
            String director = read.next();
            System.out.println("Ingrese duración de la película");
            Integer duracion = read.nextInt();
            Pelicula pelicula = new Pelicula(titulo, director, duracion);
            peliculas.add(pelicula);
            System.out.println("Desea agregar otra película? s/n");
        } while (read.next().equalsIgnoreCase("S"));

        peliculas.forEach((pelicula) -> {
            System.out.println(pelicula);
        });

        System.out.println("Mostramos solo las películas que duran más de una hora");

        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion() >= 60) {
                System.out.println(pelicula);
            }

        }

        System.out.println("--Ordenadas por titulo--");

        Collections.sort(peliculas, Pelicula.ordenarTitulo);

        peliculas.forEach((pelicula) -> {
            System.out.println(pelicula);
        });

        System.out.println("--Ordenadas por director--");

        Collections.sort(peliculas, Pelicula.ordenarDirector);

        peliculas.forEach((pelicula) -> {
            System.out.println(pelicula);
        });

        System.out.println("--Ordenadas por duración--");

        Collections.sort(peliculas, Pelicula.ordenarDuracion);

        peliculas.forEach((pelicula) -> {
            System.out.println(pelicula);
        });

        System.out.println("--Ordenadas por duración pero al revés--");

        Collections.sort(peliculas, Pelicula.invertirDuracion);

        peliculas.forEach((pelicula) -> {
            System.out.println(pelicula);
        });
    }

}
