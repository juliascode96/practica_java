/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número
entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta
clase debe contener un método toString() que retorne el número de carta y el palo. La
baraja estará compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no
haya más o se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese
número de cartas. En caso de que haya menos cartas que las pedidas, no
devolveremos nada, pero debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido
ninguna indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una
carta y luego se llama al método, este no mostrara esa primera carta.
 */
package ejercicio.pkg8.pkg3;

import java.util.ArrayList;
import java.util.Collections;

public class Baraja {
    private ArrayList <Carta> cartas;
    private int cantidadDeCartas;

    public Baraja() {
        cantidadDeCartas = 40;
    }

    public Baraja(ArrayList<Carta> cartas) {
        this.cartas = cartas;
        cantidadDeCartas = 40;
    }

    

    public int getCantidadDeCartas() {
        return cantidadDeCartas;
    }

    public void setCantidadDeCartas(int cantidadDeCartas) {
        this.cantidadDeCartas = cantidadDeCartas;
    }
    
    
    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    @Override
    public String toString() {
        return "Baraja{" + "cartas=" + cartas + '}';
    }
    
    //Métodos
    
    public ArrayList<Carta> barajar(){
        Collections.shuffle(cartas);
        
        return cartas;
    }
    
    
    
    public void siguienteCarta(){
        if (cantidadDeCartas>0) {
            System.out.println(cartas.get(0));  
        } else {
            System.out.println("No hay más cartas");
        }
    }
    
    
    /*
    • darCartas(): dado un número de cartas que nos pidan, le devolveremos ese
    número de cartas. En caso de que haya menos cartas que las pedidas, no
    devolveremos nada, pero debemos indicárselo al usuario.
    */
    
    public ArrayList<Carta> darCartas(int cant){
       ArrayList<Carta> mano = new ArrayList();
        if (cantidadDeCartas>=cant) {
            for (int i = 0; i < cant; i++) {
              mano.add(cartas.get(0));
              cartas.remove(0);
            }
            cantidadDeCartas = cartas.size();
  
        } else {
            System.out.println("No hay suficientes cartas");
        }
       return mano;
    }
    
    /*
    • cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido
    ninguna indicárselo al usuario
    */
    
    public void cartasMonton(ArrayList<ArrayList> monton) {
        if (monton.isEmpty()) {
            System.out.println("No hay cartas entregadas");
        } else {
            for (ArrayList a : monton) {
                System.out.println(a);
            }
        }
 
    }
    
    public void mostrarBaraja(){
        for (Carta carta : cartas) {
            System.out.println(carta);
        }
    }
}
