
package extra.pkg5.pkg6;
import java.util.Scanner;


public class Extra56 {

    
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        Scanner Sc1 = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas");
        int n = Sc.nextInt();
        double prom1 = 0;
        double prom2 = 0;
        int bajos = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese altura de la persona " + (i+1));
            double altura = Sc1.nextDouble();
            
            if (altura <= 1.60) {
                bajos++;
                prom1 = prom1 + altura;
                
            } 
            
            prom2 = prom2 + altura;
            
            
        }
        
        prom1 = prom1/bajos;
        prom2 = prom2/n;
        
        System.out.println("El promedio de altura de personas que miden 1,60m o menos es: " + prom1+"m");
        System.out.println("El promedio de altura de todas las personas es: " + prom2 +"m");
       
    }
    
}
