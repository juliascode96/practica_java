/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.
 */
package ejercicio.pkg8.pkg1;

import java.util.ArrayList;
import java.util.Scanner;


public class PersonaSV {
    Scanner read = new Scanner(System.in);
    
    public Persona crearPersona() {
        System.out.println("Ingrese su nombre");
        String nombre = read.next();
        System.out.println("Ingrese su apellido");
        String apellido = read.next();
        System.out.println("Ingrese su edad");
        Integer edad = read.nextInt();
        System.out.println("Ingrese su documento");
        Integer documento = read.nextInt();
        Persona p = new Persona(nombre, apellido, edad, documento);
        return p;
    }
    
    public Persona adoptarPerro(Persona p) {
        PerroSV sv = new PerroSV();
        System.out.println("Por favor ingrese los datos del perro a adoptar");
        Perro perro = sv.crearPerro();
        p.setPerro(perro);
        return p;
    }
    
    public void llenarYMostrar() {
      ArrayList<Persona> personas = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
           Persona p = crearPersona(); 
           adoptarPerro(p);
           personas.add(p);
        }
        for (Persona persona : personas) {
                System.out.println(persona);
            }
    }
    
}
