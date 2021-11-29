//Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
//salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
//deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
//número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.

package ejercicio.pkg5.pkg16;
import java.util.Scanner;

public class Ejercicio516 {
  
    public static void main(String[] args) {
        int suma = 0;
        int num;
        
        Scanner Sc = new Scanner(System.in);
        
        for (int i = 0; i < 20; ++i) {
        System.out.println("Ingrese un número");
        num = Sc.nextInt();
            if (num > 0) {
                suma = suma + num;
                
            }
            if (num == 0) {
                System.out.println("Se capturó el número 0");
                break;
                
            }
            
            
}
    
        System.out.println("La suma de los número positivos ingresados es: " + suma);
       
    }
    
}
