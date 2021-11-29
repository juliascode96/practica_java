/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package com.nespresso.cafetera;

public class controlCafetera {
    
    public static void llenarCafetera(Cafetera cafetera){
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        System.out.println("La cafetera seleccionada se ha llenado hasta su capacidad máxima de " + cafetera.getCapacidadMaxima() + "ml");
    }
    
    public static void servirTaza(Cafetera cafetera, int tamañoTaza){
        boolean tazaLlena;
       if (tamañoTaza<=cafetera.getCantidadActual()) {
           tazaLlena = true;
           cafetera.setCantidadActual(cafetera.getCantidadActual()-tamañoTaza);
           System.out.println("Su taza está llena y a la cafetera le quedan " + cafetera.getCantidadActual() + "ml");
       } else {
           tazaLlena = false;
           System.out.println("Se han llenado " + cafetera.getCantidadActual() + "ml de lataza");
           cafetera.setCantidadActual(0);
       }
    }
    
    public static void vaciarCafetera(Cafetera cafetera) {
       cafetera.setCantidadActual(0);
        System.out.println("Su cafetera se encuentra ahora vacía");
    }
    
    public static void agregarCafe(Cafetera cafetera, int cantidadCafe) {
       if ((cafetera.getCantidadActual()+ cantidadCafe)<=cafetera.getCapacidadMaxima()) {
           cafetera.setCantidadActual(cafetera.getCantidadActual()+cantidadCafe);
           System.out.println("Su cafetera ahora tiene " + cafetera.getCantidadActual() + "ml de café");
       } else {
           int derramado = (cafetera.getCantidadActual() + cantidadCafe) - cafetera.getCapacidadMaxima();
           cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
           System.out.println("Su cafetera ahora está llena pero ha derramado " + derramado + "ml de café");
       }
    }
    
}
