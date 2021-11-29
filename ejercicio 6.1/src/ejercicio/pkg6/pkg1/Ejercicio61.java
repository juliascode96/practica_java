/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.
 */
package ejercicio.pkg6.pkg1;

public class Ejercicio61 {

    public static void main(String[] args) {
       
        String titulo = "";
        String autor = "";
        String ISBN  = "";
        int numeroDePaginas = 0;
        
        Libro libro = new Libro(titulo, ISBN, autor, numeroDePaginas);
                
        libro = libro.cargarLibro(titulo, ISBN, autor, numeroDePaginas);
        libro.leerDatos();
        
        
        
        
  
       
    }
   
}
