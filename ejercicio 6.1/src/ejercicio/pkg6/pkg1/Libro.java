package ejercicio.pkg6.pkg1;

import java.util.Scanner;

public class Libro {

    private String titulo;
    private String ISBN;
    private String autor;
    private int numeroDePaginas;

    
    public Libro(String titulo, String ISBN, String autor, int numeroDePaginas) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    public Libro cargarLibro(String titulo, String ISBN, String autor, int numeroDePaginas) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese título del libro");
        titulo = leer.nextLine();
        
        System.out.println("Ingrese ISBN del libro");
        ISBN = leer.nextLine();
       
        System.out.println("Ingrese autor del libro");
        autor = leer.nextLine();
        
        System.out.println("Ingrese cantidad de páginas");
        numeroDePaginas = leer.nextInt();
        
        Libro libro = new Libro(titulo, ISBN, autor, numeroDePaginas);
        libro.setTitulo(titulo);
        libro.setISBN(ISBN);
        libro.setAutor(autor);
        libro.setNumeroDePaginas(numeroDePaginas);
        return libro;

    }
    
    public void leerDatos() {
        Libro libro = new Libro(titulo, ISBN, autor, numeroDePaginas);
        System.out.println("Titulo: " + libro.getTitulo());
        System.out.println("ISBN: " + libro.getISBN());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Número de páginas: " + libro.getNumeroDePaginas());

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

}
