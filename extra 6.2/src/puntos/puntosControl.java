/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa
en los atributos del objeto. Después, a través de otro método calcular y devolver la
distancia que existe entre los dos puntos que existen en la clase Puntos.
 */
package puntos;

import java.util.Scanner;
public class puntosControl {
    public Puntos crearPuntos() {
        Puntos punto = new Puntos();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese x1");
        punto.setX1(leer.nextInt());
        System.out.println("Ingrese y1");
        punto.setY1(leer.nextInt());
        System.out.println("Ingrese x2");
        punto.setX2(leer.nextInt());
        System.out.println("Ingrese y2");
        punto.setY2(leer.nextInt());
        return punto;
        
    }
    
    public int calcularDistancia(Puntos puntos) {
        int distancia = (int)Math.sqrt
                        (Math.pow(puntos.getX2()-puntos.getX1(), 2) 
                        + Math.pow(puntos.getY2()-puntos.getY1(), 2));
        return distancia;
    }
    
}
