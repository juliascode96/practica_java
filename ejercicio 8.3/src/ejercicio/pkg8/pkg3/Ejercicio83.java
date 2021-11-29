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

public class Ejercicio83 {

    public static void main(String[] args) {
     ArrayList<Carta> cartas = new ArrayList();
     ArrayList<ArrayList> monton = new ArrayList();
     String palo;
     
        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    palo="espada";
                    break;
                case 1:
                    palo="copa";
                    break;
                case 2:
                    palo="oro";
                    break;
                case 3:
                    palo="basto";
                    break;
                default:
                    palo="";
                       
            }
            for (int j = 0; j < 12; j++) {
                if (j != 7 && j != 8) {
                   Carta c = new Carta(j+1, palo);
                   cartas.add(c);
                }
            }
            
        }
     Baraja b1 = new Baraja(cartas);
     System.out.println("MOSTRAR BARAJA");
     b1.mostrarBaraja();
     System.out.println("CANTIDAD: " + b1.getCartas().size());
     System.out.println("BARAJAR");
     b1.barajar();
     System.out.println("MOSTRAR BARAJA");
     b1.mostrarBaraja();
     System.out.println("CANTIDAD: " + b1.getCartas().size());
     System.out.println("SIGUIENTE CARTA");
     b1.siguienteCarta();
     System.out.println("DAR CARTAS");
     monton.add(b1.darCartas(5));
     System.out.println("CANTIDAD: " + b1.getCartas().size());
     System.out.println("MOSTRAR BARAJA");
     b1.mostrarBaraja();
     System.out.println("SIGUIENTE CARTA");
     b1.siguienteCarta();
     System.out.println("MOSTRAR CARTAS REPARTIDAS");
     b1.cartasMonton(monton);
     System.out.println("DAR CARTAS");
     monton.add(b1.darCartas(5));
     System.out.println("MOSTRAR CARTAS REPARTIDAS");
     b1.cartasMonton(monton);
     System.out.println("MOSTRAR BARAJA");
     b1.mostrarBaraja();
    }
    
}
