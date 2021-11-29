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

import java.util.Comparator;


public class Pelicula {

    private String titulo;
    private String director; //apellido
    private Integer duracion; //en minutos porque me la re banco

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }

    public static Comparator<Pelicula> ordenarDuracion = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getDuracion().compareTo(o2.getDuracion());

        }
    };
    
     public static Comparator<Pelicula> invertirDuracion = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o2.getDuracion().compareTo(o1.getDuracion());

        }
    };
    
    public static Comparator<Pelicula> ordenarTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getTitulo().compareTo(o2.getTitulo());

        }
    };
    
    public static Comparator<Pelicula> ordenarDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getDirector().compareTo(o2.getDirector());

        }
    };
}
