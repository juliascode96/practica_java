
package extra.pkg8.pkg2;

import java.util.Scanner;

public class Cliente {
    private String nombre;
    private int edad;
    private double dineroDisponible;
    private String asientoAsignado;

    public String getAsientoAsignado() {
        return asientoAsignado;
    }

    public void setAsientoAsignado(String asientoAsignado) {
        this.asientoAsignado = asientoAsignado;
    }

    public Cliente() {
    }

    public Cliente(String nombre, int edad, double dineroDisponible) {
        this.nombre = nombre;
        this.edad = edad;
        this.dineroDisponible = dineroDisponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDineroDisponible() {
        return dineroDisponible;
    }

    public void setDineroDisponible(double dineroDisponible) {
        this.dineroDisponible = dineroDisponible;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", edad=" + edad + ", dineroDisponible=" + dineroDisponible + ", asientoAsignado=" + asientoAsignado + '}';
    }


    
    //Metodos
    
    public Cliente nuevoCliente() {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nom = read.next();
        System.out.println("Ingrese su edad");
        int edadC = read.nextInt();
        System.out.println("Ingrese dinero disponible");
        double dinero = read.nextDouble();
        Cliente c = new Cliente(nom, edadC, dinero);
        return c; 
    }
    
}
