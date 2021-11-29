
package extra.pkg8.pkg2;

import java.util.ArrayList;
import java.util.Scanner;

public class Cine {
    private Sala sala;
    private double precio;
    private Pelicula pelicula;

    public Cine() {
    }

    public Cine(Sala sala, double precio, Pelicula pelicula) {
        this.sala = sala;
        this.precio = precio;
        this.pelicula = pelicula;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    @Override
    public String toString() {
        return "Cine{" + "sala=" + sala + ", precio=" + precio + ", pelicula=" + pelicula + '}';
    }
    
    //Metodos
    
    public ArrayList<Cliente> revisarDatos(){
        precio = 700;
        ArrayList<Cliente> cs = new ArrayList();
        Scanner read = new Scanner(System.in);
        Pelicula p1 = new Pelicula();
        pelicula = p1.reproducir();
        String selector;
        System.out.println(pelicula);
        System.out.println(precio);
        
        do {
          Cliente c1 = new Cliente();
          c1 = c1.nuevoCliente();
          
            if (c1.getDineroDisponible()>precio && c1.getEdad()>pelicula.getEdadMinima()) {
              Integer f = (int) Math.floor(Math.random()*(8-1+1)+1);
              int c = (int) Math.floor(Math.random()*(8-1+1)+1); 
              String columna;
              switch(c) {
                  case 1: 
                      columna = "A";
                      break;
                  case 2:
                      columna = "B";
                      break;
                  case 3:
                      columna = "C";
                      break;
                  case 4:
                      columna = "D";
                      break;
                  case 5:
                      columna = "E";
                      break;
                  case 6:
                      columna = "F";
                      break;
                  default:
                      columna = "A";
              }
              String asiento = f.toString().concat(columna);
              c1.setAsientoAsignado(asiento);
              cs.add(c1);
                System.out.println("Su asiento: " + asiento);
            } else {
                System.out.println("Lo sentimos, usted no cumple los requerimientos para entrar");
            }
            System.out.println("Queda alguien en la fila?");
            selector = read.next();
        } while (selector.equalsIgnoreCase("si"));
        
     return cs;   
    }
    
    public void nocheDePelis(){
      ArrayList<Cliente> clientes = revisarDatos();
      Sala s = new Sala();
      sala = s.llenarSala(s, clientes);
    }
}
