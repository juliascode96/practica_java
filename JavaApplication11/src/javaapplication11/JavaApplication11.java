
package javaapplication11;
import java.util.Scanner;

public class JavaApplication11 {

 
    public static void main(String[] args) {
        
        System.out.println("Ingrese un número del 1 al 4");
        
        Scanner Sc = new Scanner(System.in);
        int selector = Sc.nextInt();
        
        switch(selector) {
            case 1: 
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4: 
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba");
                
        }
        
    }
    
}
