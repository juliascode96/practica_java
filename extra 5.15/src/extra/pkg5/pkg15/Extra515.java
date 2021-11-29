/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los
datos de las personas ingresadas por teclado e indique si son mayores o menores
de edad. Después de cada persona, el programa debe preguntarle al usuario si
quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra
“No”.
*/
package extra.pkg5.pkg15;
import java.util.Scanner;

public class Extra515 {

   
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        
        String resp = "";
        String nombre;
        int edad;
        
        while(!resp.equalsIgnoreCase("No")) {
            System.out.println("Ingrese nombre");
            nombre = Sc.next();
            System.out.println("Ingrese la edad de "+nombre);
            edad = Sc.nextInt();
            
            System.out.println(nombre);
            System.out.println(edad);
            
            if (edad>17) {
                System.out.println(nombre+" es mayor de edad");
                
            } else {
                System.out.println(nombre+" no es mayor de edad");
            }
            
            System.out.println("Desea seguir ingresando personas? (Si/No)");
            resp = Sc.next();
            
        }
        
    }
    
}
