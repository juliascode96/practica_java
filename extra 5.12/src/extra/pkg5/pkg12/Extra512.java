/*
Crear un programa que dibuje una escalera de números, donde cada línea de
números comience en uno y termine en el número de la línea. Solicitar la altura de
la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
 */
package extra.pkg5.pkg12;
import java.util.Scanner;


public class Extra512 {

   
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int j;
        
        for (int i = 0; i < n+1; i++) {
            j = i;
            
            while (j>=1) {
                System.out.print((i-j)+1);
                j--;
            }
            
            System.out.println("");
            
        }

    }
    
}
