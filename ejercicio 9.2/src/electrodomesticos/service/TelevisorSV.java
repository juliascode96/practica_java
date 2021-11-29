
package electrodomesticos.service;

import electrodomesticos.Televisor;
import java.util.Scanner;

public class TelevisorSV extends ElectrodomesticoSV{
    Televisor v = new Televisor();
    
    @Override
    public void crearElectrodomestico() {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese resolución del televisor");
        Integer res = read.nextInt();
        System.out.println("Ingrese si el televisor tiene sintetizador");
        String r = read.next();
        super.crearElectrodomestico();
        v.setSintonizador(r.equalsIgnoreCase("si")); 
        v.setResolucion(res);
    }
    
    @Override
    public void precioFinal() {
        super.precioFinal(); 
        
        if(v.getSintonizador()) {
            v.setPrecio(v.getPrecio() + 500);
        }
        
        if (v.getResolucion()>40) {
          v.setPrecio(v.getPrecio() + (v.getPrecio()*0.3));
        }
        
    }
    
    public void mostrar() {
        System.out.println("Las caracteristicas de su televisor: "
                            + "\n Precio: " + v.getPeso() 
                            + "\n Color: " + v.getColor() 
                            + "\n Consumo: " + v.getConsumo() 
                            + "\n Resolución: " + v.getResolucion()
                            + "\n Sintonizador: " + v.getSintonizador()
                            + "\n Precio: " + v.getPrecio());
    }
    
    public void todo() {
        v.crearElectrodomestico();
        v.precioFinal();
    }
    
    
}
