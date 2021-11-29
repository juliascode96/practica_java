/*
Simular la división usando solamente restas. Dados dos números enteros mayores
que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo
restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor
que el divisor, este resultado es el residuo, y el número de restas realizadas es el
cociente. Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
*/
package extra.pkg5.pkg9;
import java.util.Scanner;

public class Extra59 {

  
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        
        System.out.println("Ingrese dos números");
        int n1 = Sc.nextInt();
        int n2 = Sc.nextInt();
        int cociente = 0;
        
        while (n1>n2) {
            n1 = n1-n2;
            cociente++;
            
        }
        
        System.out.println("El cociente de la divisón es: "+cociente);
        System.out.println("El resto de la división es: "+n1);
        
    }
    
}
