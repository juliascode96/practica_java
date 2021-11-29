/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package ejercicio.pkg6.pkg2;

import circulo.Circulo;


public class Ejercicio62 {


    public static void main(String[] args) {
        Circulo circulo = new Circulo(0);
        circulo = circulo.crearCircunferencia();
        System.out.println("Radio: "+ area(circulo));
        System.out.println("Radio: "+ perimetro(circulo));
        
    }
    
    private static double area(Circulo circulo){
        double area = 3.14 * (circulo.getRadio()*circulo.getRadio());
        return area;
    }
    
    private static double perimetro(Circulo circulo){
        double perimetro = 2 * 3.14 * circulo.getRadio();
        return perimetro;
    }
    
}
