/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package ejercicio.pkg6.pkg5;
import cuenta.Cuenta;
import static cuenta.controlCuenta.consultarDatos;
import static cuenta.controlCuenta.consultarSaldo;
import static cuenta.controlCuenta.ingresar;
import static cuenta.controlCuenta.retirar;
import java.util.Scanner;
public class Ejercicio65 {

 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su DNI");
        long DNI = leer.nextLong();
        
        System.out.println("Ingrese su número de cuenta");
        int numeroCuenta = leer.nextInt();
        
        System.out.println("Ingrese su saldo");
        double saldo = leer.nextDouble();
        
        Cuenta miCuenta = new Cuenta(numeroCuenta, DNI, saldo);
        
        System.out.println("Cuanto dinero desea ingresar");
        double ingreso = leer.nextDouble();
        
        ingresar(ingreso, miCuenta);
        consultarSaldo(miCuenta);
        
        System.out.println("Cuanto dinero desea retirar");
        double retiro = leer.nextDouble();
        
        retirar(retiro, miCuenta);
        consultarSaldo(miCuenta);
        
        consultarDatos(miCuenta);
    }
    
    
}
