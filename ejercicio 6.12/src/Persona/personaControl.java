/*
• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
Tener en cuenta que para conocer la edad de la persona también se debe
conocer la fecha actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro
otra edad y retorna true en caso de que el receptor tenga menor edad que la
persona que se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
package Persona;
import java.util.Date;
import java.util.Scanner;

public class personaControl {
    public static Persona crearPersona() {
        Persona persona = new Persona();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese nombre de la persona");
        String nombre = leer.nextLine();
        System.out.println("Ingrese día de nacimiento");
        int dia = leer.nextInt();
        System.out.println("Ingrese mes de nacimiento");
        int mes = leer.nextInt();
        System.out.println("Ingrese año de nacimiento");
        int anio = leer.nextInt();
        
        Date fechaDeNacimiento = new Date(anio-1900, mes-1, dia);
        persona.setFechaNacimiento(fechaDeNacimiento);
        persona.setNombre(nombre);
        
        return persona;
    }
    
    public static int calcularEdad(Persona persona) {
        Date fechaActual = new Date();
        int anioActual = fechaActual.getYear();
        int anioNacimiento = persona.getFechaNacimiento().getYear();
        
        if (fechaActual.getMonth()>=persona.getFechaNacimiento().getMonth()) {
            int edad = anioActual - anioNacimiento;
            return edad;
            
        } else {
            int edad = anioActual - anioNacimiento - 1;
            return edad;
        }
    }
    
    public static boolean menorQue(int edad, int edadPersona) {
        return edad>edadPersona;
        
    }
    
    public static void mostrarPersona(Persona persona) {
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de nacimiento: " + persona.getFechaNacimiento());
    }
}
