/*
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, la
función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
(incluidos), significa que el peso está por debajo de su peso ideal y la función
devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25
significa que la persona tiene sobrepeso, y la función devuelve un 1. Se recomienda
hacer uso de constantes para devolver estos valores.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
 */
package com.persona.persona;

import java.util.Scanner;

public class controlPersona {

    public static Persona crearPersona() {
        Scanner leer = new Scanner(System.in);
        String genero;
        System.out.println("Ingrese nombre");
        String nombre = leer.nextLine();
        System.out.println("Ingrese edad");
        int edad = leer.nextInt();
        System.out.println("Ingrese género");
        String resp = leer.next();
        if (resp.equalsIgnoreCase("H") || resp.equalsIgnoreCase("M") || resp.equalsIgnoreCase("O")) {
            genero = resp;
        } else {
            System.out.println("Error - Género inválido \n Se colocará -otro- por defecto ");
            genero = "O";
        }
        System.out.println("Ingrese peso");
        double peso = leer.nextDouble();
        System.out.println("Ingrese altura");
        double altura = leer.nextDouble();
        Persona persona = new Persona(nombre, edad, genero, peso, altura);
        return persona;
    }

    public static int calcularIMC(Persona persona) {
        double IMC = persona.getPeso() / (persona.getAltura() * persona.getAltura());

        if (IMC < 20) {
            System.out.println("Bajo peso");
            return -1;
        } else if (IMC >= 20 || IMC <= 25) {
            System.out.println("Peso normal");
            return 0;
        } else {
            System.out.println("Sobrepeso");
            return 1;
        }
    }
    
    public static boolean esMayorDeEdad(Persona persona) {
        if (persona.getEdad()<18) {
            System.out.println("Menor");
            return false;
            
        } else {
            System.out.println("Mayor");
            return true;
        }
    }
}
