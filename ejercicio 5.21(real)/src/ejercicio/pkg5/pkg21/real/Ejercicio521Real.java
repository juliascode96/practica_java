
package ejercicio.pkg5.pkg21.real;
import java.util.Scanner;

public class Ejercicio521Real {

   
    public static void main(String[] args) {
      Scanner Sc = new Scanner(System.in);
        System.out.println("Ingrese un valor en euros");
        double monto = Sc.nextInt();
        System.out.println("¿A qué moneda desea transformarlo? (libras/dolares/yenes)");
        
        Scanner Sc1 = new Scanner(System.in);
        String moneda = Sc1.nextLine();
        
        convertir(moneda, monto);
 
        
    }
       public static void convertir(String moneda, double monto) {
           switch (moneda) {
               case "libras":
                   monto = monto * 0.86;
                   System.out.println("El total en libras es: " + monto);
                   break;
               case "dolares":
                  monto = monto * 1.28611;
                   System.out.println("El total en dolares es: " + monto);
                   break; 
               case "yenes":
                   monto = monto * 129.852;
                   System.out.println("El total en yenes es: " + monto);
                   break;
               default:
                   System.out.println("Moneda inválida");
                   
           }
          
       }
}
    
 

    


