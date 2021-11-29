
package extra.pkg8.pkg2;

import java.util.Scanner;

public class Pelicula {
    private String titulo;
    private int duracion;
    private int edadMinima;
    private String director;

    public Pelicula() {
    }

    public Pelicula(String titulo, int duracion, int edadMinima, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", duracion=" + duracion + ", edadMinima=" + edadMinima + ", director=" + director + '}';
    }
    
    //Metodos
    
    public Pelicula reproducir(){
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese titulo de la pelicula a reproducir");
        String t = read.next();
        System.out.println("Ingrese duración");
        int dur = read.nextInt();
        System.out.println("Ingrese edad mínima");
        int edadM = read.nextInt();
        System.out.println("Ingrese apellido del director");
        String d = read.next();
        Pelicula p = new Pelicula(t, dur, edadM, d);
        return p;
    }
    
    
}
