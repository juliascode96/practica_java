/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2
 */
package ejercicio.pkg6.pkg4;

import static ejercicio.pkg6.pkg4.Rectangulo.dibujarRectangulo;
import static ejercicio.pkg6.pkg4.Rectangulo.perimetro;
import static ejercicio.pkg6.pkg4.Rectangulo.superficie;
import java.util.Scanner;


public class Ejercicio64 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dimensiones del rectangulo");
        double base = leer.nextInt();
        double altura = leer.nextInt();
        Rectangulo rectangulo = new Rectangulo(base, altura);
        System.out.println("La superficie del rectangulo es: " + superficie(rectangulo));
        System.out.println("El perímetro del rectangulo es: " + perimetro(rectangulo));
        dibujarRectangulo(rectangulo);
    }
    
}
