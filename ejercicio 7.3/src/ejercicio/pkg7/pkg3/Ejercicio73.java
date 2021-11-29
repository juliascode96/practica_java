/*
Crear una clase llamada Alumno que mantenga información sobre las notas de
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista
de tipo Integer con sus 3 notas.
En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Despues de ese bluce tendremos el siguiente método en la clase Alumno:
Metodo notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular
su nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al
método. Dentro del método se usará la lista notas para calcular el promedio final
de alumno. Siendo este promedio final, devuelto por el método y mostrado en el
main.
 */
package ejercicio.pkg7.pkg3;

import Alumno.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio73 {
    
    public static void main(String[] args) {
        ArrayList <Alumno> alumnos = new ArrayList();
        Scanner read = new Scanner(System.in);
        Scanner read1 = new Scanner(System.in);
        do {
            System.out.println("Ingrese nombre del alumno");
            String nombre = read.next();
            System.out.println("Ingrese apellido del alumno");
            String apellido = read.next();
            ArrayList <Integer> notas = new ArrayList();
            System.out.println("Ingrese nota 1");
            notas.add(read1.nextInt());
            System.out.println("Ingrese nota 2");
            notas.add(read1.nextInt());
            System.out.println("Ingrese nota 3");
            notas.add(read1.nextInt());
            Alumno alumno = new Alumno(nombre, apellido, notas);
            alumnos.add(alumno);
            System.out.println("Desea agregar otro alumno? s/n");
        } while (read.next().equalsIgnoreCase("S"));
        
        System.out.println("Ahora mostramos la lista");
        alumnos.forEach((i) -> { //funcion flecha
            System.out.println(i);
        });
        
        do {
            System.out.println("Ingrese apellido del alumno del que desea calcular la nota final");
            String apellido = read.next();
           
            for (int i = 0; i < alumnos.size(); i++) {
                if (alumnos.get(i).getApellido().equalsIgnoreCase(apellido)) {
                    System.out.println("La nota final del alumno " + alumnos.get(i).getApellido() + " es " + alumnos.get(i).notaFinal());
                    
                }
        }
            
            System.out.println("Desea calcular la nota final de otro alumno? s/n");
        } while (read.next().equalsIgnoreCase("S"));
        
        
        
    }
    
}
