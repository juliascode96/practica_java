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
package cuenta;


public class controlCuenta {
    
    public static void ingresar(double ingreso, Cuenta cuenta) {
        cuenta.setSaldo(cuenta.getSaldo() + ingreso);
        
    }
    
    public static void retirar(double retiro, Cuenta cuenta) {
        cuenta.setSaldo(cuenta.getSaldo() - retiro);
        
        if (cuenta.getSaldo() < 0) {
            cuenta.setSaldo(0);
            
        }
        
    }
    
    public static void extraccionRapida(double retiro, Cuenta cuenta) {
        
        
        if (retiro <= (cuenta.getSaldo()*0.20)) {
          cuenta.setSaldo(cuenta.getSaldo() - retiro);  
        } else {
            System.out.println("Saldo insuficiente");
        }
        
    }
    
    public static void consultarSaldo(Cuenta cuenta) {
        System.out.println("Su saldo es: "+ cuenta.getSaldo());
    }
    
    public static void consultarDatos(Cuenta cuenta) {
        System.out.println("Su DNI es: "+ cuenta.getDNI());
        System.out.println("Su saldo es: "+ cuenta.getSaldo());
        System.out.println("Su número de cuenta es: "+ cuenta.getNumeroCuenta());
    }
    
}
