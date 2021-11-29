
package extra.pkg6.pkg4;

import NIF.NIF;
import NIF.nifControl;
import java.util.Scanner;
public class Extra64 {

  
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese DNI");
        long DNI = read.nextLong();
        nifControl sv = new nifControl();
        NIF nif = sv.crearNif(DNI);
        nif = sv.crearNif(DNI);
        System.out.println(DNI%23);
        sv.mostrar(nif);
        
    }
    
}
