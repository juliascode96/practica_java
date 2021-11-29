/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los
guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
error. Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
pasar una división por cero, el método devuelve 0 y se le informa al usuario el
error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
al main.
 */
package ejercicio.pkg6.pkg3;
import java.util.Scanner;

public class Operacion {
    private int num1;
    private int num2;
    
    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public Operacion crearOperacion(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        Operacion operacion = new Operacion(num1, num2);
        return operacion;
    }
    
    public static int sumar(){
       Operacion operacion = new Operacion(0,0);
       operacion = operacion.crearOperacion();
       int suma = operacion.getNum1()+operacion.getNum2();
       return suma;
    }
    
    public static int restar(){
       Operacion operacion = new Operacion(0,0);
       operacion = operacion.crearOperacion();
       int resta = operacion.getNum1()-operacion.getNum2();
       return resta;
    }
    
    public static int multiplicar(){
       Operacion operacion = new Operacion(0,0);
       operacion = operacion.crearOperacion();
       
        if (operacion.getNum1() == 0 || operacion.getNum2() == 0) {
            System.out.println("Error");
            return 0;        
        } else {
            int mult = operacion.getNum1() * operacion.getNum2();
            return mult;
        }
    }
    
    public static double dividir(){
       Operacion operacion = new Operacion(0,0);
       operacion = operacion.crearOperacion();
       
        if (operacion.getNum2() == 0) {
            System.out.println("Error");
            return 0;        
        } else {
            double div = operacion.getNum1() / operacion.getNum2();
            return div;
        }
    }
    

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
           
    
}
