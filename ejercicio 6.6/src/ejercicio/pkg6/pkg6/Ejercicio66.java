/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */

package ejercicio.pkg6.pkg6;
import com.nespresso.cafetera.Cafetera;
import com.nespresso.cafetera.controlCafetera;
import java.util.Scanner;

public class Ejercicio66 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de su cafetera");
        int capacidadMaxima = leer.nextInt();
        System.out.println("Ingrese la cantidad actual de café en su cafetera");
        int cantidadActual = leer.nextInt();
        
        Cafetera cafetera = new Cafetera(capacidadMaxima, cantidadActual);
        
        controlCafetera.llenarCafetera(cafetera);
        
        System.out.println("¿De qué tamaño es la taza que desea servir?");
        int tamañoTaza = leer.nextInt();
        
       controlCafetera.servirTaza(cafetera, tamañoTaza);
       
        System.out.println("¿Cuánto café desea servir?");
        int cantidadCafe = leer.nextInt();
        
        controlCafetera.agregarCafe(cafetera, cantidadCafe);
        controlCafetera.vaciarCafetera(cafetera);
        
    }
    
}
