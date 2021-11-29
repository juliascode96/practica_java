
package extra.pkg5.pkg4;

import java.util.Scanner;

public class Extra54 {

  
    public static void main(String[] args) {
        System.out.println("Ingrese un número entre el 1 y el 10");
        Scanner Sc = new Scanner(System.in);
        
        int num = Sc.nextInt();
        
        switch (num) {
            case 1:
                System.out.println(num + " en romano se escribe I");
                break;
            case 2:
                System.out.println(num + " en romano se escribe II");
                break;
            case 3:
                System.out.println(num + " en romano se escribe III");
                break;
            case 4:
                System.out.println(num + " en romano se escribe IV");
                break;
            case 5:
               System.out.println(num + " en romano se escribe V"); 
               break;
            case 6:
                System.out.println(num + " en romano se escribe VI");
                break;
            case 7:
                System.out.println(num + " en romano se escribe VII");
                break;
            case 8:
                System.out.println(num + " en romano se escribe VIII");
                break;
            case 9:
                System.out.println(num + " en romano se escribe IX");
                break;
            case 10:
                System.out.println(num + " en romano se escribe X");
                break;
            default:
                    System.out.println("El número ingresado no se encuentra entre el 1 y el 10");
                        
        }
        
    }
    
}
