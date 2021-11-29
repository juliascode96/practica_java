/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M
cantidad de hijos. Escriba un programa que pida la cantidad de familias y para
cada familia la cantidad de hijos para averiguar la media de edad de los hijos de
todas las familias.
 */
package extra.pkg5.pkg13;
import java.util.Scanner;

public class Extra513 {


    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        
        System.out.println("ingrese cantidad de familias");
        int familias = Sc.nextInt();
        int hijos;
        int totalHijos = 0;
        int sumaEdades = 0;
        int edad;
        
        for (int i = 0; i < familias; i++) {
            System.out.println("Ingrese cantidad de hijos de la familia " + (i+1));
            hijos = Sc.nextInt();
            totalHijos = totalHijos + hijos;
            
            for (int j = 0; j < hijos; j++) {
                System.out.println("Ingrese la edad del hijo " + (j+1) + " de la familia "+(i+1));
                edad = Sc.nextInt();
                sumaEdades = sumaEdades + edad;
            }
        }
        
        System.out.println("El promedio de edad de los hijos de las " + familias + " familias es: "+ (sumaEdades/totalHijos));
       
    }
    
}
