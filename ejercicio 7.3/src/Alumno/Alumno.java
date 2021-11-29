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
package Alumno;

import java.util.ArrayList;



public class Alumno {
    private String nombre;
    private String apellido;
    private ArrayList<Integer> notas; 

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", notas=" + notas + '}';
    }

    
    public double notaFinal() {
        Integer suma = 0;
        
        for (int i = 0; i < notas.size(); i++) {
            suma += notas.get(i); // += es equivalente a escribir "suma = suma + notas.get(i)"
        }
        
        return (double) (suma/notas.size());
    }
    
    
}
