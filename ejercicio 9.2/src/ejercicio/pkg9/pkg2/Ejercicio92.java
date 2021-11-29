package ejercicio.pkg9.pkg2;

//import electrodomesticos.Lavadora;
//import electrodomesticos.Televisor;
import electrodomesticos.service.LavadoraSV;
import electrodomesticos.service.TelevisorSV;

public class Ejercicio92 {

    public static void main(String[] args) {

        LavadoraSV sv = new LavadoraSV();
        sv.todo();
        sv.mostrar();
        TelevisorSV sv1 = new TelevisorSV();
        sv1.todo();
        sv1.mostrar();

        
//        Lavadora l = new Lavadora();
//        Televisor v = new Televisor();
//        l.crearElectrodomestico();
//        l.precioFinal();
//        v.crearElectrodomestico();
//        v.precioFinal();
//        
//        System.out.println("Las caracteristicas de su lavadora: "
//                             + "\n Precio: " + l.getPeso() 
//                             + "\n Color: " + l.getColor() 
//                             + "\n Consumo: " + l.getConsumo() 
//                             + "\n Carga: " + l.getCarga() 
//                             + "\n Precio: " + l.getPrecio());
//        
//        System.out.println("Las caracteristicas de su televisor: "
//                             + "\n Precio: " + v.getPeso() 
//                             + "\n Color: " + v.getColor() 
//                             + "\n Consumo: " + v.getConsumo() 
//                             + "\n Resolución: " + v.getResolucion()
//                             + "\n Sintonizador: " + v.getSintonizador()
//                             + "\n Precio: " + v.getPrecio());
    }

}
