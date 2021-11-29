/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.
 */
package ejercicio.pkg8.pkg1;

import java.util.Scanner;


public class PerroSV {
    public Perro crearPerro() {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese nombre del perro");
        String nombre = read.next();
        System.out.println("Ingrese raza del perro");
        String raza = read.next();
        System.out.println("Ingrese edad del perro");
        Integer edad = read.nextInt();
        System.out.println("Ingrese tamaño del perro (pequeño/mediano/grande)");
        String tamaño = read.next();
        Perro p1 = new Perro(nombre, raza, edad, tamaño);
        return p1;
    }
    
}
