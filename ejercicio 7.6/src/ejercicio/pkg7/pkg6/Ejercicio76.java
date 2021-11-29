/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los
distintos productos que venderemos y el precio que tendrán. Además, se necesita
que la aplicación cuente con las funciones básicas.
Estas las realizaremos en el main. Como, introducir un elemento, modificar su
precio, eliminar un producto y mostrar los productos que tenemos con su precio
(Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto y de valor
el precio. Realizar un menú para lograr todas las acciones previamente
mencionadas.
 */
package ejercicio.pkg7.pkg6;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio76 {

    public static void main(String[] args) {
        HashMap<String, Double> productos = new HashMap();
        Scanner read = new Scanner(System.in);
        int selector = 0;

        while (selector != 5) {
            System.out.println("Ingrese el número de la acción que desea realizar");
            System.out.println("1. Agregar un producto "
                                + "\n 2. Modificar el precio de un producto "
                                + "\n 3. Eliminar un producto "
                                + "\n 4. Ver todos los productos "
                                + "\n 5. Salir");
            selector = read.nextInt();
            switch (selector) {
                case 1:
                    System.out.println("Ingrese nombre del producto");
                    String nombre = read.next();
                    System.out.println("Ahora ingrese su precios");
                    Double precio = read.nextDouble();
                    productos.put(nombre, precio);
                    break;
                case 2:
                    System.out.println("Ingrese nombre del producto que desea modificar");
                    String producto = read.next();
                    System.out.println("Ingrese nuevo precio");
                    Double nuevoPrecio = read.nextDouble();
                    productos.entrySet().forEach((aux) -> {
                        if (producto.equalsIgnoreCase(aux.getKey())) {
                            productos.replace(aux.getKey(), aux.getValue(), nuevoPrecio);
                        } else {
                            System.out.println("El producto no fue encontrado aún");
                        }
                    });
                    break;
                case 3:
                    System.out.println("Ingrese nombre del producto que desea eliminar");
                    producto = read.next();
                    productos.remove(producto);
                    break;
                case 4:
                    productos.entrySet().forEach((aux) -> {
                        String key = aux.getKey();
                        Double value = aux.getValue();

                        System.out.println("Producto: " + key + ", precio: " + value);
                    });
                default:
                    break;
            }
            

        }
    }

}
