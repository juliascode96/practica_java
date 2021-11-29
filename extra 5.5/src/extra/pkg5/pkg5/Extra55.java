
package extra.pkg5.pkg5;
import java.util.Scanner;

public class Extra55 {

    
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        
        System.out.println("Ingrese categoría del socio");
        String cat = Sc.next();
        
        System.out.println("Ingrese costo del tratamiento");
        double costo = Sc.nextInt();
        
        switch (cat) {
            case "A":
                costo = costo * 0.50;
                System.out.println("El costo al aplicar el descuento del 50% es: " + costo);
                break;
            case "B":
                costo = costo - (costo * 0.30);
                System.out.println("El costo al aplicar el descuento del 30% es: " + costo);
                break;
            case "C":
                System.out.println("El costo del tratamiento es " + costo);
                break;
            default:
                System.out.println("Categoría no encontrada");
        }
    }
    
}
