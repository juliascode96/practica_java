
package electrodomesticos.service;

import electrodomesticos.Lavadora;
import java.util.Scanner;

public class LavadoraSV extends ElectrodomesticoSV{
    Lavadora l = new Lavadora();
    
    @Override
    public void crearElectrodomestico() {
        Scanner read = new Scanner(System.in);
        System.out.println("Cuánta carga soporta la lavadora?");
        Double carga = read.nextDouble();
        super.crearElectrodomestico();
        l.setCarga(carga);
    }
    
    public void mostrar() {
        System.out.println("Las caracteristicas de su lavadora: "
                             + "\n Peso: " + l.getPeso() 
                             + "\n Color: " + l.getColor() 
                             + "\n Consumo: " + l.getConsumo() 
                             + "\n Carga: " + l.getCarga() 
                             + "\n Precio: " + l.getPrecio());
    }

    @Override
    public void precioFinal() {
     super.precioFinal();
     if (l.getCarga()>30) {
           l.setPrecio(l.getPrecio()+500);
        }
     
    }
    
    public void todo() {
        l.crearElectrodomestico();
        l.precioFinal();
    }

    
    
}
