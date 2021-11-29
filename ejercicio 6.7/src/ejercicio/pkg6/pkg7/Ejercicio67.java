/*
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables, para después en el main, calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores.
 */
package ejercicio.pkg6.pkg7;

import com.persona.persona.Persona;
import com.persona.persona.controlPersona;

public class Ejercicio67 {

    public static void main(String[] args) {

        int IMCbajo = 0;
        int IMCnormal = 0;
        int IMCalto = 0;
        int menor = 0;
        int mayor = 0;

        Persona juan = controlPersona.crearPersona();
        Persona silvia = controlPersona.crearPersona();
        Persona pablo = controlPersona.crearPersona();
        Persona mariana = controlPersona.crearPersona();

        switch (controlPersona.calcularIMC(juan)) {
            case -1:
                IMCbajo++;
                break;
            case 0:
                IMCnormal++;
                break;
            case 1:
                IMCalto++;
                break;

        }

        switch (controlPersona.calcularIMC(silvia)) {
            case -1:
                IMCbajo++;
                break;
            case 0:
                IMCnormal++;
                break;
            case 1:
                IMCalto++;
                break;

        }

        switch (controlPersona.calcularIMC(pablo)) {
            case -1:
                IMCbajo++;
                break;
            case 0:
                IMCnormal++;
                break;
            case 1:
                IMCalto++;
                break;

        }

        switch (controlPersona.calcularIMC(mariana)) {
            case -1:
                IMCbajo++;
                break;
            case 0:
                IMCnormal++;
                break;
            case 1:
                IMCalto++;
                break;

        }

        if (controlPersona.esMayorDeEdad(juan) == true) {
            mayor++;
        } else {
            menor--;
        }

        if (controlPersona.esMayorDeEdad(silvia) == true) {
            mayor++;
        } else {
            menor--;
        }

        if (controlPersona.esMayorDeEdad(pablo) == true) {
            mayor++;
        } else {
            menor--;
        }

        if (controlPersona.esMayorDeEdad(mariana) == true) {
            mayor++;
        } else {
            menor--;
        }
        
        
        double porcentajeBajo = (IMCbajo * 4) / 100;
        double porcentajeNormal = (IMCnormal * 4) / 100;
        double porcentajeAlto = (IMCalto * 4) / 100;
        double porcentajeMayor = (mayor * 4) / 100;
        double porcentajeMenor = (menor * 4) / 100;
        
        System.out.println("El porcentaje de personas con IMC bajo es: " + porcentajeBajo);
        System.out.println("El porcentaje de personas con IMC normal es: " + porcentajeNormal);
        System.out.println("El porcentaje de personas con IMC alto es: " + porcentajeAlto);
        System.out.println("El porcentaje de personas mayores de edad es: " + porcentajeMayor);
        System.out.println("El porcentaje de personas menores de edad es: " + porcentajeMenor);

    }

}
