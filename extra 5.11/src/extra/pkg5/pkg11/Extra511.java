/*
Escribir un programa que lea un número entero y devuelva el número de dígitos
que componen ese número. Por ejemplo, si introducimos el número 12345, el
programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente
utilizando el operador de división. Nota: recordar que las variables de tipo entero
truncan los números o resultados.
 */
package extra.pkg5.pkg11;
import java.util.Scanner;

public class Extra511 {

    
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        
        System.out.println("Ingrese un número");
        int n = Sc.nextInt();
        int digitos = 0;
        
        while (n>0) {
            n = n/10;
            digitos++;
            
        }
        
        System.out.println(digitos);
        
    }
    
}
