package ejercicio.pkg9.pkg2;

import electrodomesticos.Electrodomestico;
import electrodomesticos.Lavadora;
import electrodomesticos.Televisor;
import java.util.ArrayList;

public class ejercicio93 {

    public static void main(String[] args) {
        Lavadora l1 = new Lavadora();
        Lavadora l2 = new Lavadora();
        Televisor v1 = new Televisor();
        Televisor v2 = new Televisor();
        ArrayList <Electrodomestico> compra = new ArrayList();
       
        
        l1.crearElectrodomestico();
        l2.crearElectrodomestico();
        v1.crearElectrodomestico();
        v2.crearElectrodomestico();
        
        compra.add(l1);
        compra.add(l2);
        compra.add(v1);
        compra.add(v2);
        
        double cont = 0;
        double lp = 0;
        double vp = 0;
        
        for (Electrodomestico elec : compra) {
            elec.precioFinal();
            System.out.println(elec.getPrecio());
            cont = cont + elec.getPrecio();
            if (elec instanceof Lavadora) {
               lp = lp + elec.getPrecio();
            } else {
                vp = vp + elec.getPrecio();
            }

        }
        
        System.out.println("El precio de todos los electrodomesticos es: " + cont);
        System.out.println("El precio de todos los televisores es: " + vp);
        System.out.println("El precio de todas las lavadoras es: " + lp);
        
        
    }
    
}
