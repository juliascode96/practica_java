/*
Implemente la clase Persona. Una persona tiene un nombre y una fecha de
nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set.
 */
package Persona;

import java.util.Date;

public class Persona {
    
//Atributos
    private String nombre;
    private Date fechaNacimiento;

//Constructores   
    public Persona() {
    }

    public Persona(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

//Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
    
}
